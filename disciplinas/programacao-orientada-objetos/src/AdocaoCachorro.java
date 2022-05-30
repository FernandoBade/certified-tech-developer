//Exerc�cio 1
//        Imagine uma institui��o que adota cachorros, e para a ado��o � obrigat�rio que os cachorros registrados
//        no sistema possuam informa��es como: est� apto ou n�o para a ado��o, ra�a, ano aproximado de nascimento,
//        peso, possuem chip ou n�o, estejam feridos ou n�o e atribu�do o primeiro nome para eles na institui��o.
//
//        Precisaremos saber a idade do cachorro e validar se ele possui um chip para localiza��o.
//
//        Um cachorro pode ser encaminhado para ado��o se n�o estiver ferido e pesar mais de 5 kg.


import java.time.Year;

public class AdocaoCachorro {

    private String nome;
    private String raca;
    private int anoNascimento;
    private double peso;
    private boolean temChip;
    private boolean ferido;
    private boolean apto;

    public AdocaoCachorro(String nome, String raca, int anoNascimento, double peso, boolean temChip, boolean ferido) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.temChip = temChip;
        this.ferido = ferido;
        apto = (temChip && !ferido);
    }

    public AdocaoCachorro(String nome, int anoNascimento, double peso, boolean temChip, boolean ferido) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.temChip = temChip;
        this.ferido = ferido;
        raca = "N�o informada";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getTemChip() {
        return temChip;
    }

    public void setTemChip(boolean temChip) {
        this.temChip = temChip;
    }

    public boolean getFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    public boolean getApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public String calcularIdade() {
        int idade = Year.now().getValue() - anoNascimento;
        if (idade < 1) {
            return "Menos de 1 ano";
        } else if (idade == 1) {
            return "1 ano";
        } else {
            return idade + " anos";
        }
    }

    public String podeSerAdotado() {
        System.out.println("Ficha cadastral de " + nome + ":" + System.lineSeparator());
        System.out.println("Ra�a: " + raca);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Tem chip: " + (temChip? "Sim" : "N�o"));
        System.out.println("Est� ferido: " + (ferido? "Sim" : "N�o"));
        System.out.println("---------------------------------------------");

        if (!ferido && temChip && peso > 5) {
            System.out.println(getNome() + " j� pode ir para ado��o!");
        } else {
            System.out.println(getNome() + " ainda n�o pode ir para ado��o :(");
        }
        return "---------------------------------------------";
    }

    public static void main(String[] args) {
        AdocaoCachorro cachorro = new AdocaoCachorro("Valentino", "SRD", 2007, 13, true, false);
        System.out.println(cachorro.podeSerAdotado());

        AdocaoCachorro cachorro2 = new AdocaoCachorro("Adilson", "Labrador", 2018, 18, false, false);
        System.out.println(cachorro2.podeSerAdotado());

        AdocaoCachorro cachorro3 = new AdocaoCachorro("Catarina", 2021, 3.5, true, false);
        System.out.println(cachorro3.podeSerAdotado());
    }
}
