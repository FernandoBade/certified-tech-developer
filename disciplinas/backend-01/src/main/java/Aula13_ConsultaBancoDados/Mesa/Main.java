package Aula13_ConsultaBancoDados.Mesa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Logger;

public class Main {
    private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista;"
            + "CREATE TABLE Dentista"
            + "("
            + "Id INT PRIMARY KEY,"
            + "Nome  VARCHAR(100) NOT NULL,"
            + "Sobrenome VARCHAR(100) NOT NULL,"
            + "matricula VARCHAR(50) NOT NULL"
            + ");";

    private static final String sqlInsert = "INSERT INTO Dentista(id, nome, sobrenome, matricula) VALUES(?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Main.class.getName());
        Dentista dentista1 = new Dentista(1, "Luiz", "Guerreiro", "3258741");

        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1, dentista1.getId());
            preparedStatementInsert.setString(2, dentista1.getNome());
            preparedStatementInsert.setString(3, dentista1.getSobrenome());
            preparedStatementInsert.setString(4, dentista1.getMatricula());
            preparedStatementInsert.execute();

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, dentista1.setMatricula("1234"));
            preparedStatementUpdate.setInt(2, dentista1.getId());
            preparedStatementUpdate.execute();


            connection.setAutoCommit(true);
            logger.info("Dados adicionados com sucesso: " + dentista1);

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}