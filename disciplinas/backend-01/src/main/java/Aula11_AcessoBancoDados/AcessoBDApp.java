package Aula11_AcessoBancoDados;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class AcessoBDApp {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Animal;CREATE TABLE Animal"+
            "("+"id INT PRIMARY KEY,"
            +"Nome VARCHAR(100) NOT NULL,"
            +"Tipo VARCHAR(100) NOT NULL"
            +")";

    private static final String sqlInsert1 = "INSERT INTO Animal (id, nome, tipo) VALUES (1, 'Valentino', 'Cachorro')";
    private static final String sqlInsert2 = "INSERT INTO Animal (id, nome, tipo) VALUES (2, 'Niki', 'Cachorro')";
    private static final String sqlInsert3 = "INSERT INTO Animal (id, nome, tipo) VALUES (3, 'Pandora', 'Gato')";
    private static final String sqlInsert4 = "INSERT INTO Animal (id, nome, tipo) VALUES (4, 'Maurício', 'Cavalo')";
    private static final String sqlInsert5 = "INSERT INTO Animal (id, nome, tipo) VALUES (5, 'Kong', 'Macaco')";

    private static final String sqlDelete = "DELETE FROM Animal WHERE id = 2";

    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);
            
            ShowAnimal(connection);
            statement.execute(sqlDelete);
            ShowAnimal(connection);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                return;
            }
            connection.close();
        }

    }

    private static void ShowAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Animal";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)
                    + " - "
                    + resultSet.getString(2)
                    + " - "
                    + resultSet.getString("tipo"));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        //em usuário e senha, colocar as credenciais do banco de dados local
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
}
