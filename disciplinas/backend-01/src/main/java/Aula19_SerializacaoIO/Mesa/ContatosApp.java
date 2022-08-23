package Aula19_SerializacaoIO.Mesa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContatosApp {

    public static void main(String[] args) {

        //criando a lista e instanciando os contatos
        List<Contato> contatos = new ArrayList<>();
        Contato contato1 = new Contato("José Silva", "11 9 9999-9999", "jose.silva@email.com");
        Contato contato2 = new Contato("Maria Silva", "12 8 8888-8888", "maria.silva@email.com");

        //populando a lista antes de inserir no arquivo
        contatos.add(contato1);
        contatos.add(contato2);

        //criacao do arquivo output e salvamento da lista de contatos
        FileOutputStream contatosOutput = null;

        try {
            contatosOutput = new FileOutputStream("contatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(contatosOutput);
            objectOutputStream.writeObject(contatos);

        } catch (IOException e) {
            throw new RuntimeException();
        }

        //recuperação do arquivo com a lista de contatos
        List<Contato> contatos2 = null;
        FileInputStream contatoInput = null;

        try {
            contatoInput = new FileInputStream("contatos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(contatoInput);

            contatos2 = (ArrayList) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Contato contato : contatos2) {
            System.out.println(contato.getNome() + " : " + contato.getTelefone() + " : " + contato.getEmail());
        }

    }
}
