package Aula01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public class Pessoa {
        private String nome;
        private String sobrenome;
        LocalDate idade;
        List<String> colecao = new ArrayList<>();


        public Pessoa(String nome, String sobrenome) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public LocalDate getIdade() {
            return idade;
        }

        public void setIdade(LocalDate idade) {
            this.idade = idade;
        }

        public List<String> getColecao() {
            return colecao;
        }

        public void setColecao(List<String> colecao) {
            this.colecao = colecao;
        }

        public List<String> adicionarNomes(Pessoa pessoa) {
            int var = pessoa.getNome().length();
            int idade = pessoa.Idade();
            if(var > 5 && idade > 18) {
                colecao.add(pessoa.getNome());
                System.out.println("Nome adicionado com sucesso!");
            }
            return colecao;
        }

        private int Idade() {
            int idade = Period.between(this.idade, LocalDate.now()).getYears();
            return idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", sobrenome='" + sobrenome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }

};
