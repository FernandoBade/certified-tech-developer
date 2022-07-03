package Checkpoint02;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal, double saldo, double investimento) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal, saldo, investimento);
    }

    public ContaPoupanca(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal);
    }

    public ContaPoupanca(String nomeCompleto, String cpf, String endereco, String profissao) {
        super(nomeCompleto, cpf, endereco, profissao);
    }

}
