public interface IGradeDeFilmes {

    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}