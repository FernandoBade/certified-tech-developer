package Checkpoint02;

import java.util.Random;

public abstract class Conta extends SaldoExeption {
    Random random = new Random();

    private final String numeroDaConta = String.format("%d", random.nextInt(99999));
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String profissao;
    private double rendaMensal;
    private double saldo;
    private double investimento;

    public Conta(String nomeCompleto, String cpf, String endereco, String profissao, double rendaMensal, double investimento) {
        super("Saldo insuficiente");
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.saldo = 0;
        this.investimento = investimento;
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

    public String getCpf() {
        return cpf;
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

    public void sacar(double valor) {
        try {
            if (valor > this.getSaldo()) {
                throw new SaldoExeption("Saldo insuficiente");
            } else {
                this.setSaldo(this.getSaldo() - valor);
            }
        } catch (SaldoExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta conta) {

        try {
            if (valor > this.getSaldo()) {
                throw new SaldoExeption("Saldo insuficiente");
            } else {
                this.setSaldo(this.getSaldo() - valor);
                conta.setSaldo(conta.getSaldo() + valor);
            }
        } catch (SaldoExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public void fazerInvestimento(double valor) {
        saldo -= valor;
        investimento += valor;
    }

    @Override
    public String toString() {
        return "Detalhes da Conta: " + System.lineSeparator()
                + "--------------------------------" + System.lineSeparator()
                + "Número da Conta: " + this.getNumeroDaConta() + System.lineSeparator()
                + "Nome Completo: " + this.getNomeCompleto() + System.lineSeparator()
                + "CPF: " + this.getCpf() + System.lineSeparator()
                + "Endereço: " + this.getEndereco() + System.lineSeparator()
                + "Profissão: " + this.getProfissao() + System.lineSeparator()
                + "Renda Mensal: " + this.getRendaMensal() + System.lineSeparator()
                + "Saldo: " + this.getSaldo() + System.lineSeparator()
                + "Investimento: " + this.getInvestimento() + System.lineSeparator()
                + "--------------------------------" + System.lineSeparator();
    }
}
