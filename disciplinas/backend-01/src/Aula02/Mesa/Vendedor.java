package Aula02.Mesa;

import static Aula02.Mesa.Categorias.*;

public abstract class Vendedor {
    public String nome;
    public Enum<Categorias> categoria;
    int pontos;

    public Vendedor(String nome, int pontos) {
        this.nome = nome;
        this.pontos = 0;
        this.categoria = NOVATO;
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
        if (this.categoria == NOVATO) {
            return "Novato";
        } else if (this.categoria == APRENDIZ) {
            return "Aprendiz";
        } else if (this.categoria == BOM) {
            return "Bom";
        } else if (this.categoria == MESTRE) {
            return "Mestre";
        }
        return null;
    }

    public abstract void vender(int qtdVendas);

    public Enum<Categorias> mostrarCategoria() {
        if (pontos < 20) {
            setCategoria(NOVATO);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        } else if (pontos <= 30) {
            setCategoria(APRENDIZ);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        } else if (pontos <= 40) {
            setCategoria(BOM);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        } else {
            setCategoria(MESTRE);
            System.out.println("O vendedor " + nome + " tem um total de " + getPontos() + " pontos e está na categoria " + getCategoria());
        }
        return null;
    }

}


