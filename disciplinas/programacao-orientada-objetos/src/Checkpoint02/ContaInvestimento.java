package Checkpoint02;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        super(nomeCompleto, cpf, endereco, profissao, rendaMensal);
    }

    public Double verificarRentabilidade(){
        double rentabilidadeMensal = 0;
        if (this.getInvestimento() > 20000){
            rentabilidadeMensal = 0.05;
        } else if (this.getInvestimento() > 50000){
            rentabilidadeMensal = 0.10;
        } else if (this.getInvestimento() > 100000) {
            rentabilidadeMensal = 0.15;
        }
    return rentabilidadeMensal;
    }

}
