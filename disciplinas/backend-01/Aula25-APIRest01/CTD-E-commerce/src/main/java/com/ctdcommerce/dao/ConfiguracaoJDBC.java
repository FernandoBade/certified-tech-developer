package com.ctdcommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfiguracaoJDBC {

    private final String jdbcDriver;
    private final String baseURL;
    private final String usuario;
    private final String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String baseURL, String usuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.baseURL = baseURL;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName(this.jdbcDriver);
            connection = DriverManager.getConnection(baseURL,usuario,senha);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
        return connection;
    }
}
