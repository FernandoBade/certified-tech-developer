import java.sql.*;
import java.util.logging.Logger;

public class ContaBancoApp {
    //dados de criação da tabela "conta"
    private static final String sqlCreate = "DROP TABLE IF EXISTS Conta;"
            + "CREATE TABLE Conta"
            + "("
            + "id INT PRIMARY KEY,"
            + "Nome VARCHAR(100) NOT NULL,"
            + "NumeroConta VARCHAR(100) NOT NULL,"
            + "Saldo NUMERIC (15,2)"
            + ")";

    //dados de inserção na tabela "conta"
    private static final String sqlInsert = "INSERT INTO Conta (id, nome, numeroConta, saldo)"
            + " VALUES (? , ? , ? , ?)";

    //dados de atualização de saldo na tabela "conta", utilizando o ID
    private static final String sqlUpdate = "UPDATE Conta SET saldo = saldo = ? WHERE id = ?";


    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(ContaBancoApp.class.getName());
        Conta conta = new Conta(1, "Maria", "12345", 30);

        //cria a conexão com o banco de dados
        Connection connection = null;
        try {
            connection = ConnectionJDBC.getConnection();

            //cria o statement para executar as instruções SQL
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            //cria o preparedStatement para executar as instruções SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);

            //atualiza o id da conta
            preparedStatement.setInt(1, conta.getId());

            //atualiza o nome da conta
            preparedStatement.setString(2, conta.getNome());

            //atualiza o numero da conta
            preparedStatement.setString(3, conta.getNumeroConta());

            //atualiza o saldo da conta
            preparedStatement.setDouble(4, conta.getSaldo());

            //executa o comando SQL
            preparedStatement.execute();

            //loga a mensagem de sucesso
            logger.info("Dados adicionados com sucesso: " + conta.toString());

            //realiza o update de R$10 no saldo da conta
            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setDouble(1, conta.aumentarSaldo(10));
            preparedStatementUpdate.setInt(2, conta.getId());
            preparedStatementUpdate.execute();

            //interrompe a execução dos auto-commits dentro do banco de dados
            connection.setAutoCommit(false);

            //realiza o update de R$15 no saldo da conta
            PreparedStatement preparedStatementUpdate2 = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate2.setDouble(1, conta.aumentarSaldo(15));
            preparedStatementUpdate2.setInt(2, conta.getId());
            preparedStatementUpdate2.execute();

            //reativa o autocommit no banco de dados
            connection.commit();
            connection.setAutoCommit(true);


        } catch (Exception e) {
            //loga a mensagem de erro
            logger.warning("Erro ao adicionar dados: " + e.getMessage());

            //realiza o rollback do programa e retorna ao ponto antes do commit
            connection.rollback();

        } finally {
            //fecha a conexão com o banco de dados
            connection.close();
        }
    }

}

