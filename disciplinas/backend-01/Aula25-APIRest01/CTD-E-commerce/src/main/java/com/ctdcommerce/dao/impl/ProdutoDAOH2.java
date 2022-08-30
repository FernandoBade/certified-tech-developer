package com.ctdcommerce.dao.impl;

import com.ctdcommerce.dao.ConfiguracaoJDBC;
import com.ctdcommerce.dao.IDao;
import com.ctdcommerce.model.Produto;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;


@Configuration
public class ProdutoDAOH2 implements IDao<Produto> {


    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = getLogger(ProdutoDAOH2.class);

    @Override
    public Produto salvar(Produto produto) throws SQLException {
        log.info("Iniciando conexão com o banco de dados...");

        String SQLInsert = String.format("INSERT INTO produto (nomeProduto,valor)"+
                "VALUES ('%s','%s')",produto.getNomeProduto(),produto.getValor());

        Connection connection = null;
        try {
            log.info("Salvando produto " + produto.getNomeProduto());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) produto.setId(resultSet.getInt(1));

        } catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao cadastrar o produto " + e.getMessage());

        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        log.debug("Iniciando conexão com o banco de dados...");
        Connection connection = null;
        Statement statement = null;
        String SQLSelect = "SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<>();

        try {
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

            connection = configuracaoJDBC.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLSelect);
            log.debug("Buscando todos os produtos cadastrados...");

            while (resultSet.next()){
                produtos.add(criarObjetoProduto(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            log.error("Erro ao cadastrar o produto. " +  e.getMessage());

        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
        return produtos;
    }


    @Override
    public void alterar(Produto produto) throws SQLException{
        log.info("Iniciando conexão com o banco de dados...");
        String SQLUpdate = String.format("UPDATE produtos set valor = '%s' WHERE id = '%s';",
                produto.getValor(), produto.getId());
        Connection connection = null;

        try {
            log.info("Alterando o valor do produto: " + produto.getNomeProduto());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLUpdate);

        } catch (SQLException e){
            e.printStackTrace();
            log.error("Erro ao alterar o produto." + e.getMessage());
        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
    }

    @Override
    public Optional<Produto> buscarPorId(int id) throws SQLException{
        log.debug("Iniciando conexão com o banco de dados...");
        Connection connection = null;
        Statement statement = null;
        String SQLSelect = String.format("SELECT * FROM produtos WHERE id = '%s'",id);
        Produto produto = null;
        try {
            log.info("Buscando o produto pelo ID: " + produto.getId());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

            connection = configuracaoJDBC.getConnection();
            log.debug("Buscado produto pelo id: " + id);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLSelect);
            while (resultSet.next()){
                produto = criarObjetoProduto(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            log.error("Erro ao buscar o produto pelo ID." + e.getMessage());

        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
        ;
        return produto != null ? Optional.of(produto) : Optional.empty();
    }

    @Override
    public void excluir(int id) throws SQLException{
        log.debug("Iniciando conexão com o banco de dados...");
        Connection connection = null;
        Statement statement = null;
        String SQLDelete = String.format("DELETE * FROM produtos WHERE id = '%s'",id);
        try {
            log.info("Excluindo o produto com o ID: " + id);
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

            connection = configuracaoJDBC.getConnection();
            log.debug("Excluindo produto pelo id: " + id);
            statement = connection.createStatement();
            statement.execute(SQLDelete);
        } catch (SQLException e){
            e.printStackTrace();
            log.error("Erro ao excluir o produto pelo ID. " + e.getMessage());
        }finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
    }

    private Produto criarObjetoProduto(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String nomeProduto = resultSet.getString("nomeProduto");
        double valor = resultSet.getDouble("valor");
        return new Produto(id, nomeProduto,valor);
    }
}
