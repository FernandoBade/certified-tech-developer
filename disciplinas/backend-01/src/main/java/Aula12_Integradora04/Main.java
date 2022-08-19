//Enunciado
//
//        Fazer uma aplicação que deverá criar uma tabela de usuário, que contenha as seguintes colunas e tipos de dados:
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

    //Instrução para criar a tabela "Usuario". Caso já exista, apaga e cria uma nova tabela
    private static final String sqlCreateTable =
            "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"
                    + "("
                    + "id INT PRIMARY KEY,"
                    + "Primeiro_Nome VARCHAR(100) NOT NULL,"
                    + "Sobrenome VARCHAR(100) NOT NULL,"
                    + "Idade INT NOT NULL"
                    + ")";

    //Instrução para inserir dados (tuplas) diferentes na tabela "Usuario"
    private static final String sqlInsert1 = "INSERT INTO Usuario (id, Primeiro_Nome, Sobrenome, Idade)"
            + "VALUES"
            + " (1, 'Maria', 'Almeida', 50)";

    private static final String sqlInsert2 = "INSERT INTO Usuario (id, Primeiro_Nome, Sobrenome, Idade)"
            + "VALUES"
            + " (2, 'João', 'Silva', 25)";

    private static final String sqlInsert3 = "INSERT INTO Usuario (id, Primeiro_Nome, Sobrenome, Idade)"
            + "VALUES"
            + " (3, 'Carolina', 'Santos', 35)";


    //Instrução para excluir uma tupla da tabela "Usuario"
    private static final String sqlDelete = "DELETE FROM Usuario WHERE id = 2";

    //Iniciação do Logging para registrar as alterações da tupla
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    //Método main para executar as instruções
    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();

            //Executa as instruções para criar a tabela e inserir dados
            statement.execute(sqlCreateTable);
            logger.info("Tabela Usuario criada com sucesso");

            //Executa as instruções para inserir dados na tabela
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            logger.info("Dados inseridos na tabela Usuario com sucesso");

            //Executa as instruções para excluir uma tupla da tabela
            statement.execute(sqlDelete);
            logger.info("Excluído o usuário com id = 2");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connection == null) logger.info("Não foi possível conectar ao banco de dados");
            connection.close();
        }
    }

    //Conecta com o banco de dados
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
