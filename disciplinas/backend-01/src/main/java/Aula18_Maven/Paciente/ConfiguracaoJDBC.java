package Aula18_Maven.Paciente;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfiguracaoJDBC {
    private String jdbcDriver;
    private String jdbcURL;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String jdbcURL, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.jdbcURL = jdbcURL;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.jdbcURL = ""
                + "jdbc:h2:mem:pacientes;"
                + "DB_CLOSE_DELAY=-1;"
                + "INIT=RUNSCRIPT FROM 'Aula18_Maven_Mesa.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conectarComBancoDeDados() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, nomeUsuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
