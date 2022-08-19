//Enunciado
//
//        Fazer uma aplica��o que dever� criar uma tabela de usu�rio, que contenha as seguintes colunas e tipos de dados:
//
//        - ID int
//        - Primeiro_Nome varchar
//        - Sobrenome varchar
//        - Idade int
//
//        Em seguida, devemos inserir 3 linhas (tuplas) diferentes, depois excluir uma delas (a de sua escolha) e registrar em log para saber qual coluna foi eliminada.

package Aula12_Integradora04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Main {

    //Instru��o para criar a tabela "Usuario". Caso j� exista, apaga e cria uma nova tabela
    private static final String sqlCreateTable =
            "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"
                    + "("
                    + "id INT PRIMARY KEY,"
                    + "Primeiro_Nome VARCHAR(100) NOT NULL,"
                    + "Sobrenome VARCHAR(100) NOT NULL,"
                    + "Idade INT NOT NULL"
                    + ")";

    //Instru��o para inserir dados (tuplas) diferentes na tabela "Usuario"
    private static final String sqlInsert1 = "INSERT INTO Usuario (id, Primeiro_Nome, Sobrenome, Idade)"
            + "VALUES"
            + " (1, 'Maria', 'Almeida', 50)";

    private static final String sqlInsert2 = "INSERT INTO Usuario (id, Primeiro_Nome, Sobrenome, Idade)"
            + "VALUES"
            + " (2, 'Jo�o', 'Silva', 25)";

    private static final String sqlInsert3 = "INSERT INTO Usuario (id, Primeiro_Nome, Sobrenome, Idade)"
            + "VALUES"
            + " (3, 'Carolina', 'Santos', 35)";


    //Instru��o para excluir uma tupla da tabela "Usuario"
    private static final String sqlDelete = "DELETE FROM Usuario WHERE id = 2";

    //Inicia��o do Logging para registrar as altera��es da tupla
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    //M�todo main para executar as instru��es
    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();

            //Executa as instru��es para criar a tabela e inserir dados
            statement.execute(sqlCreateTable);
            logger.info("Tabela Usuario criada com sucesso");

            //Executa as instru��es para inserir dados na tabela
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            logger.info("Dados inseridos na tabela Usuario com sucesso");

            //Executa as instru��es para excluir uma tupla da tabela
            statement.execute(sqlDelete);
            logger.info("Exclu�do o usu�rio com id = 2");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connection == null) logger.info("N�o foi poss�vel conectar ao banco de dados");
            connection.close();
        }
    }

    //Conecta com o banco de dados
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
