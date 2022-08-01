import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aula01 {
    public class Pessoa {
        private String nome;
        private String sobrenome;
        LocalDate idade;
        List<String> colecao = new ArrayList<>();

        public Pessoa(String nome, String sobrenome) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }
    }
};
