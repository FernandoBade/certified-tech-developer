public class UsuarioJogo {
    private String nome;
    private String nickname;
    private Integer pontuacao = 0;
    private Integer nivel = 1;


    public UsuarioJogo(String nome, String nickname, Integer pontuacao, Integer nivel) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void aumentarPontuacao(Integer pontuacao) {
        this.pontuacao += pontuacao;
        setNivel(this.nivel = this.pontuacao / 100);

    }

    public void bonus(Integer pontuacao) {
        setPontuacao(this.pontuacao += pontuacao);
        setNivel(this.nivel = this.pontuacao / 100);

    }

    public void aumentarNivel(Integer nivel) {
        this.nivel += nivel;
    }
}
