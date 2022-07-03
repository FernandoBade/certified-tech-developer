package Checkpoint02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;


public abstract class Conta extends PeladoBank {
    Locale ptBr = new Locale("pt", "BR");
    Random random = new Random();
    private final String numeroDaConta = String.format("%d", random.nextInt(99999));
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String profissao;
    private double rendaMensal;
    private double saldo;
    private double investimento;

    public Conta(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.saldo = 0;
        this.investimento = 0;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public void sacar(double valor) throws SaldoException {
        try {
            if (valor > this.getSaldo()) {
                throw new SaldoException("Saldo insuficiente");
            } else {
                this.setSaldo(this.getSaldo() - valor);
            }
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta conta) {

        try {
            if (valor > this.getSaldo()) {
                throw new SaldoException("Saldo insuficiente");
            } else {
                this.setSaldo(this.getSaldo() - valor);
                conta.setSaldo(conta.getSaldo() + valor);
            }
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fazerInvestimento(double valor) {
        saldo -= valor;
        investimento += valor;
    }

    @Override
    public String toString() {
        String rendaFormatada = NumberFormat.getCurrencyInstance(ptBr).format(rendaMensal);
        String saldoFormatado = NumberFormat.getCurrencyInstance(ptBr).format(this.getSaldo());
        String investimentoFormatado = NumberFormat.getCurrencyInstance(ptBr).format(this.getInvestimento());
        return "Detalhes da Conta: " + System.lineSeparator()
                + "--------------------------------" + System.lineSeparator()
                + "N�mero da Ag�ncia: " + this.getAgenciaMatriz() + System.lineSeparator()
                + "N�mero da Conta: " + this.getNumeroDaConta() + System.lineSeparator()
                + "Nome Completo: " + this.getNomeCompleto() + System.lineSeparator()
                + "CPF: " + this.getCpf() + System.lineSeparator()
                + "Endere�o: " + this.getEndereco() + System.lineSeparator()
                + "Profiss�o: " + this.getProfissao() + System.lineSeparator()
                + "Renda Mensal: " + rendaFormatada + System.lineSeparator()
                + "Saldo: " + saldoFormatado + System.lineSeparator()
                + "Investimento: " + investimentoFormatado + System.lineSeparator()
                + "--------------------------------" + System.lineSeparator();
    }
}
