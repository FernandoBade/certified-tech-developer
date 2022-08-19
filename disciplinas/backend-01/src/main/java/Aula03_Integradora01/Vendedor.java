package Aula03_Integradora01;

public abstract class Vendedor {
    public String nome;
    public Enum<Categorias> categoria;
    int pontos;

    public Vendedor(String nome, int pontos) {
        this.nome = nome;
        this.pontos = 0;
        this.categoria = Categorias.NOVATO;
    }

    public Vendedor(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setCategoria(Enum<Categorias> categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        if (this.categoria == Categorias.NOVATO) {
            return "Novato";
        } else if (this.categoria == Categorias.APRENDIZ) {
            return "Aprendiz";
        } else if (this.categoria == Categorias.BOM) {
            return "Bom";
        } else if (this.categoria == Categorias.MESTRE) {
            return "Mestre";
        }
        return null;
    }

    public abstract void vender(int qtdVendas);

    public abstract void calculaPontos();

    public Enum<Categorias> mostrarCategoria() {
        if (pontos < 20) {
            setCategoria(Categorias.NOVATO);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        } else if (pontos <= 30) {
            setCategoria(Categorias.APRENDIZ);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        } else if (pontos <= 40) {
            setCategoria(Categorias.BOM);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        } else {
            setCategoria(Categorias.MESTRE);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        }
        return null;
    }

}


