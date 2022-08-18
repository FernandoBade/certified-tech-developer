package Aula17_Avaliacao01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialDaoH2 implements IDao<Filial>{

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(Filial.class));

    public FilialDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Filial salvar(Filial filial) {
        log.info("Registrando uma nova filial: " + filial.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO FILIAIS (nome, rua, numero, cidade, estado, e5estrelas) VALUES ( '%s','%s','%s','%s','%s','%s')",

                filial.getNome(),filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.getE5estrelas());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return filial;
    }
}
