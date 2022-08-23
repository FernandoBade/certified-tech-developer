package Aula20_Integradora06;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private String nome;
    private String sobreNome;
    private String cpf;
    private Double salario;

    public Funcionario(String nome, String sobreNome, String cpf, Double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
