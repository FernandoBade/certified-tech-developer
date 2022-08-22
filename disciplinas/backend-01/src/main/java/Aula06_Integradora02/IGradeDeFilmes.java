package Aula06_Integradora02;

public interface IGradeDeFilmes {

    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}