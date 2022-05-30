//Exercício 1
//        Imagine uma instituição que adota cachorros, e para a adoção é obrigatório que os cachorros registrados
//        no sistema possuam informações como: está apto ou não para a adoção, raça, ano aproximado de nascimento,
//        peso, possuem chip ou não, estejam feridos ou não e atribuído o primeiro nome para eles na instituição.
//
//        Precisaremos saber a idade do cachorro e validar se ele possui um chip para localização.
//
//        Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.


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
        raca = "Não informada";
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
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Tem chip: " + (temChip? "Sim" : "Não"));
        System.out.println("Está ferido: " + (ferido? "Sim" : "Não"));
        System.out.println("---------------------------------------------");

        if (!ferido && temChip && peso > 5) {
            System.out.println(getNome() + " já pode ir para adoção!");
        } else {
            System.out.println(getNome() + " ainda não pode ir para adoção :(");
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
