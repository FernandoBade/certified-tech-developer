package Aula14_DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(MedicamentoDaoH2.class.getName());

    public MedicamentoDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.info("Registrando um novo medicamentO: " + medicamento.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("INSERT INTO medicamentos"
                        + "(nome, laboratorio, quantidade, preco)"
                        + "VALUES ('%s', '%s', %s, %s)",
                medicamento.getNome(),
                medicamento.getLaboratorio(),
                medicamento.getQuantidade(),
                medicamento.getPreco());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                medicamento.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return medicamento;
    }

    @Override
    public Medicamento buscar(Medicamento medicamento) {
        log.info("Buscando um medicamento com ID: " + medicamento.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM medicamentos WHERE id = %s", medicamento.getId());
        Medicamento medicamentoEncontrado = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                medicamentoEncontrado = new Medicamento(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("laboratorio"),
                        resultSet.getInt("quantidade"),
                        resultSet.getDouble("preco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamentoEncontrado;
    }

    @Override
    public Medicamento buscar(Integer id) {
        return null;
    }
}
