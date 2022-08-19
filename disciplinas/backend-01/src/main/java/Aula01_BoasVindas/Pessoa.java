package Aula01_BoasVindas;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public class pessoa {
        private String nome;
        private String sobrenome;
        LocalDate idade;
        List<String> colecao = new ArrayList<>();


        public pessoa(String nome, String sobrenome) {
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

        public List<String> adicionarNomes(pessoa pessoa) {
            int var = pessoa.getNome().length();
            int idade = pessoa.Idade();
            if(var > 5 && idade > 18) {
                colecao.add(pessoa.getNome());
                System.out.println(colecao);
            }
            return colecao;
        }

        private int Idade() {
            int dataNascimento = Period.between(this.idade, LocalDate.now()).getYears();
            return dataNascimento;
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
