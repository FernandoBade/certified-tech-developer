package com.ctdcommerce.dao.impl;

import com.ctdcommerce.dao.ConfiguracaoJDBC;
import com.ctdcommerce.dao.IDao;
import com.ctdcommerce.model.Produdo;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.CertPathTrustManagerParameters;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;


@Configuration
public class ProdutoDAOH2 implements IDao<Produdo> {


    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = getLogger(ProdutoDAOH2.class);

    @Override
    public Produdo salvar(Produdo produdo) throws SQLException {
        log.info("Iniciando conexão com o banco de dados...");

        String SQLInsert = String.format("INSERT INTO produtos (nomeProduto, valor) VALUES ('s%','s%')",
                produdo.getNome(),
                produdo.getValor());
        Connection connection = null;
        try {
            log.info("Salvando produto " + produdo.getNome());
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdcommerce; INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) produdo.setId(resultSet.getInt(1));

        } catch (SQLException e) {
            e.printStackTrace();
            log.error("Erro ao cadastrar o produto " + e.getMessage());

        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
        return produdo;
    }

    @Override
    public List<Produdo> buscarTodos() throws SQLException {
        log.debug("Iniciando conexão com o banco de dados...");
        Connection connection = null;
        Statement statement = null;
        String SQLSelect = "SELECT * FROM produtos";
        List<Produdo> produdos = new ArrayList<>();

        try {
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdcommerce; INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLSelect);
            log.debug("Buscando todos os produtos cadastrados...");

            while (resultSet.next()){
                produdos.add(criarObjetoProduto(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            log.error("Erro ao cadastrar o produto. " +  e.getMessage());

        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
        return produdos;
    }


    @Override
    public void alterar(Produdo produdo) throws SQLException{
        log.info("Iniciando conexão com o banco de dados...");
        String SQLUpdate = String.format("UPDATE produtos set valor = '%s' WHERE id = '%s';",
                produdo.getValor(), produdo.getId();
        Connection connection = null;

        try {
            log.info("Alterando o valor do produto: " + produdo.getNome());
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdcommerce; INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
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
    public Optional<Produdo> buscarPorId(int id) throws SQLException{
        log.debug("Iniciando conexão com o banco de dados...");
        Connection connection = null;
        Statement statement = null;
        String SQLSelect = String.format("SELECT * FROM produtos WHERE id = '%s'",id);
        Produdo produdo = null;
        try {
            log.info("Alterando o valor do produto: " + produdo.getNome());
            configuracaoJDBC = new ConfiguracaoJDBC(
                    "org.h2.Driver",
                    "jdbc:h2:~/ctdcommerce; INIT=RUNSCRIPT FROM 'ctdcommerce.sql'",
                    "sa",
                    "");
            connection = configuracaoJDBC.getConnection();
            log.debug("Buscado produto pelo id: " + id);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLSelect);
            while (resultSet.next()){
                produdo = criarObjetoProduto(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            log.error("Erro ao buscar o produto pelo ID." + e.getMessage());

        } finally {
            log.info("Conexão com o banco de dados encerrada.");
            connection.close();
        }
        ;
        return produdo != null ? Optional.of(produdo) : Optional.empty();
    }
}
