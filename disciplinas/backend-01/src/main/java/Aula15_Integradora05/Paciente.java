package Aula15_Integradora05;

import java.util.Date;

public class Paciente {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String RG;
    private String dataDeCadastro;
    private Integer endereco;

    public Paciente(Integer id, String nome, String sobrenome, String RG, String dataDeCadastro, int endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.dataDeCadastro = dataDeCadastro;
        this.endereco = endereco;
    }

    public Paciente(String nome, String sobrenome, String RG, String dataDeCadastro, int endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.dataDeCadastro = dataDeCadastro;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Integer getEndereco() {
        return endereco;
    }

    public void setEndereco(Integer endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", RG='" + RG + '\'' +
                ", dataDeCadastro=" + dataDeCadastro +
                ", endereco=" + endereco +
                '}';
    }
}
