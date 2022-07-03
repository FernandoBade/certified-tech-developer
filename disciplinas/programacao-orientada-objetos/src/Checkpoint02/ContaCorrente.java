package Checkpoint02;

public class ContaCorrente extends Conta{

    public ContaCorrente(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal, double saldo, double investimento) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal, saldo, investimento);
    }

    public ContaCorrente(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal);
    }

    public ContaCorrente(String nomeCompleto, String cpf, String endereco, String profissao) {
        super(nomeCompleto, cpf, endereco, profissao);
    }

    public String pedirCartaoDeCredito(){
        return this.getInvestimento() > 10000 || this.getRendaMensal() > 2500 ?
                "Cartão de crédito aprovado com sucesso!" :
                "Não foi possível aprovar o cartão de crédito. Procure seu gerente";
    }

}
