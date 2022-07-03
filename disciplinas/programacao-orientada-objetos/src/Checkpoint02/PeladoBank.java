package Checkpoint02;

import java.util.ArrayList;
import java.util.List;

public class PeladoBank {
    private final String nomeDoBanco = "PeladoBank";
    private final int numeroDoBanco = 886;
    private final String cnpj = "00.000.000/0000-00";
    private final int agenciaMatriz = 1000;
    private List<Conta> totalDeContas;

    public PeladoBank() {
        totalDeContas = new ArrayList<Conta>();
    }

    public void abrirConta(Conta conta) {
        totalDeContas.add(conta);
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public int getNumeroDoBanco() {
        return numeroDoBanco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getAgenciaMatriz() {
        return agenciaMatriz;
    }

    public List<Conta> getTotalDeContas() {
        return totalDeContas;
    }

    public void setTotalDeContas(List<Conta> totalDeContas) {
        this.totalDeContas = totalDeContas;
    }

    public List<Conta> totalDeContasAtivas() {
        List<Conta> contasAtivas = new ArrayList<Conta>();
        for (Conta conta : totalDeContas) {
            if (conta.getSaldo() > 0) {
                contasAtivas.add(conta);
            }
        }
        return contasAtivas;
    }

}
