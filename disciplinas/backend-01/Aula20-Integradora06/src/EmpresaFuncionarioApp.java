import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmpresaFuncionarioApp {

    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("123.456.789", "Carrefour");
        Empresa empresa2 = new Empresa("987.654.321", "Extra");


        Funcionario funcionario1 = new Funcionario("Arivaldo", "Camargo", "123.456", 9500.00);
        Funcionario funcionario2 = new Funcionario("Ed1000son", "Sousa", "456.123", 12000.00);
        Funcionario funcionario3 = new Funcionario("Mateus", "Praxedes", "555.777", 15000.00);
        Funcionario funcionario4 = new Funcionario("Fernando", "Bade", "122.322", 5000.00);

        empresa1.adicionarFuncionario(funcionario1);
        empresa1.adicionarFuncionario(funcionario2);
        empresa2.adicionarFuncionario(funcionario3);
        empresa2.adicionarFuncionario(funcionario4);

        List <Empresa> empresas = new ArrayList<>();
        empresas.add(empresa1);
        empresas.add(empresa2);

        List <Empresa> empresas2 = null;

        try{
            FileOutputStream fo = new FileOutputStream("funci_empresas.txt");
            ObjectOutputStream ous = new ObjectOutputStream(fo);
            ous.writeObject(empresas);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fi = new FileInputStream("funci_empresas.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            empresas2 = (List<Empresa>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Empresa empresa: empresas2){
            System.out.println(empresa);
            empresa.mostrarFuncionario();
        }
    }
}
