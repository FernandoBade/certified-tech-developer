package Aula18_Maven.Paciente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class PacienteDaoH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    static final Logger logger = Logger.getLogger(PacienteDaoH2.class.getName());

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        return null;
    }

    @Override
    public Paciente cadastrar(Paciente paciente) {
        logger.info("Cadastrando paciente: " + paciente.getNome());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO pacientes "
                        + "(nome, sobrenome, rg, dataCadastro, enderecoid) "
                        + "VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                paciente.getDataDeCadastro(),
                paciente.getEndereco());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()) {
                paciente.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paciente;

    }

    @Override
    public Paciente buscar(Integer t) {
        logger.info("Buscando paciente com ID: " + t);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM pacientes WHERE id = %s", t);

        Paciente pacienteEncontrado = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
            System.out.println("Paciente encontrado: ");
                System.out.println(pacienteEncontrado = new Paciente(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("sobrenome"),
                        resultSet.getString("rg"),
                        resultSet.getString("dataCadastro"),
                        resultSet.getInt("enderecoid")));
            }
            statement.close();
            connection.close();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        return pacienteEncontrado;
    }

    @Override
    public Paciente excluir(Integer t) {
        logger.info("Excluindo paciente com ID: " + t);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("DELETE FROM pacientes WHERE id = %s", t);
        Paciente pacienteExcluido = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacienteExcluido;
    }

    @Override
    public Paciente modificar(Paciente paciente) {
        logger.info("Atualizando dados do paciente: " + paciente.getNome());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("UPDATE pacientes SET "
                        + "nome = '%s', sobrenome = '%s', rg = '%s', dataCadastro = '%s', enderecoid = '%s' "
                        + "WHERE id = %s",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                paciente.getDataDeCadastro(),
                paciente.getEndereco(),
                paciente.getId());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paciente;
    }

}
