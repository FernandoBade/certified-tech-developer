package Checkpoint02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PeladoBank {
    //os dados do banco são cosntantes, e o único construtor serve para listar todas as contas e ordená-las.
    private final String nomeDoBanco = "PeladoBank";
    private final int numeroDoBanco = 886;
    private final String cnpj = "00.000.000/0000-00";
    private final int agenciaMatriz = 1000;
    private List<Conta> totalDeContas;

    public PeladoBank() {
        totalDeContas = new ArrayList<Conta>();
    }

    public void adicionarConta(Conta conta) {
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

    //lista as contas por saldo, ordenando-as de forma decrescente.
    public void listarContasPorSaldo() {
        ArrayList<Conta> contasOrdenadas = new ArrayList<Conta>(totalDeContas);
        contasOrdenadas.sort((Conta c1, Conta c2) -> {
            if (c1.getSaldo() < c2.getSaldo()) {
                return 1;
            } else if (c1.getSaldo() > c2.getSaldo()) {
                return -1;
            } else {
                return 0;
            }
        });
        for (Conta conta : contasOrdenadas) {
            System.out.println(conta.toString());
        }
    }


}
