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
        log.info("Abrindo conexão");
        String SQLInsert = String.format("INSERT INTO produtos (nomeProduto,valor)" +
                "VALUES ('%s','%s')", produto.getNomeProduto(), produto.getValor());
        Connection connection = null;
        try {
            log.info("Sanvando produto: " + produto.getNomeProduto());
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdecommerce;INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if (resultSet.next()) {
                produto.setId(resultSet.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao inserir o produto: " + e.getMessage());
        } finally {
            log.info("Fechando a conexão");
            connection.close();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String query = "SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<>();
        try {

            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdecommerce;INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            log.debug("Buscando todos os produtos do banco");

            while (resultado.next()) {
                produtos.add(criarObjetoProduto(resultado));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando a conexão no banco");
            stmt.close();
        }

        return produtos;
    }

    @Override
    public void alterar(Produto produto) throws SQLException {
        String SQLUpdate = String.format("UPDATE produtos SET valor = '%s' WHERE id = '%s';",
                produto.getValor(), produto.getId());
        Connection connection = null;
        try {
            log.info("Alterando o valor do produto: " + produto.getId());
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdecommerce;INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLUpdate);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao alterar o produto: " + e.getMessage());

        } finally {
            log.info("Fechando conexão");
            connection.close();
        }
    }

    @Override
    public Optional<Produto> buscarPorId(int id) throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String query = String.format("SELECT * FROM produtos WHERE id = '%s'", id);
        Produto produto = null;
        try {
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdecommerce;INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            log.debug("Buscando produto por id: " + id);
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()) {
                produto = criarObjetoProduto(resultado);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando a conexão no banco");
            stmt.close();
        }
        return produto != null ? Optional.of(produto) : Optional.empty();
    }

    @Override
    public void excluir(int id) throws SQLException {
        log.info("Abrindo conexão");
        Connection connection = null;
        Statement stmt = null;
        String SQLDelete = String.format("DELETE FROM produtos WHERE id = %s", id);
        try {

            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdecommerce;INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");            connection = configuracaoJDBC.getConnection();
            log.debug("Excluindo produto com id: " + id);
            stmt = connection.createStatement();
            stmt.execute(SQLDelete);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando conexão");
            connection.close();
        }

    }

    private Produto criarObjetoProduto(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("ID");
        String nomeProduto = resultSet.getString("nomeProduto");
        double valor = resultSet.getDouble("valor");
        return new Produto(id, nomeProduto, valor);
    }

}