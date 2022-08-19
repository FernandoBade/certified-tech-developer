//Enunciado
//
//        Criar uma entidade chamada Conta no banco de dados H2 que deverá ter 4 campos:
//
//        - Id;
//        - Nome;
//        - Número da Conta;
//        - Saldo.
//
//        Após criar a entidade, crie uma conexão com o banco de dados e insira um registro na conta. Em seguida,
//        realize uma atualização que adiciona 10 ao saldo, cria um transação para adicionar mais 15 ao saldo e gera uma exceção.
//        Finalmente, verifique com uma consulta se a conta possui o saldo igual ao saldo inicial.


        package Aula13_ConsultaBancoDados;

public class Conta {
    private int id;
    private String nome;
    private String numeroConta;
    private double saldo;

    public Conta(int id, String nome, String numeroConta, double saldo) {
        this.id = id;
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double aumentarSaldo(double valor) {
        return this.saldo += valor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
