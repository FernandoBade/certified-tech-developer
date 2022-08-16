//Enunciado
//
//        Uma farm�cia nos pede para desenvolver um sistema para gerenciar o estoque de seus medicamentos. Ou seja, um sistema
//        que permite o registro de medicamentos. Um medicamento � composto por:
//
//        - Id;
//        - Nome;
//        - Laborat�rio que o produz;
//        - Quantidade;
//        - Pre�o.
//
//        Nosso l�der t�cnico de arquitetura nos pede para usar o H2 como banco de dados aplicando o padr�o DAO para acessar
//        os dados e executar os m�todos que nos permitem registrar o medicamento.
//
//        Registre o resultado ou a execu��o de cada opera��o usando log4j.


package Aula14_DAO;

public class Medicamento {
    private Integer id;
    private String nome;
    private String laboratorio;
    private Integer quantidade;
    private Double preco;

    public Medicamento(Integer id, String nome, String laboratorio, Integer quantidade, Double preco) {
        this.id = id;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
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

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
