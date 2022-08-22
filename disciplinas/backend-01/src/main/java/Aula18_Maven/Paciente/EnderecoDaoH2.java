package Aula18_Maven.Paciente;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class EnderecoDaoH2 implements IDao<Endereco> {
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(EnderecoDaoH2.class.getName());

    public EnderecoDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        log.info("registrando um novo endereco: " + endereco.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO enderecos(rua, numero, cidade, bairro) VALUES('%s','%s','%s','%s')",
                endereco.getRua(), endereco.getNumero(), endereco.getCidade(), endereco.getBairro()
        );

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()){
                endereco.setEnderecoId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco cadastrar(Endereco endereco) {
        return null;
    }

    @Override
    public Endereco buscar(Integer id) {
        log.info("buscando o endereco de id: " + id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "SELECT * FROM enderecos WHERE id = %s", id);

        Endereco endereco = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("Endereço encontrado: ");
                System.out.println(endereco = new Endereco(
                        id,
                        resultSet.getString("rua"),
                        resultSet.getInt("numero"),
                        resultSet.getString("cidade"),
                        resultSet.getString("bairro")));
            }
            statement.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco excluir(Integer id) {
        log.info("excluindo o endereco de id: " + id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "DELETE FROM endereco WHERE pacienteId = %s;", id);

        Endereco endereco = null;

        try {
            statement = connection.createStatement();
            int retorno = statement.executeUpdate(query);

            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco modificar(Endereco endereco) {
        return null;
    }
}
