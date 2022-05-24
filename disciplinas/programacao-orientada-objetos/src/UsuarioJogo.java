//Implementando uma Classe
//        Para desenvolver um jogo, precisamos implementar a classe UsuarioJogo.
//        Os usuários possuem nome e um nickname, e estes dados devem ser fornecidos ao criar um novo usuário.
//        Inicialmente, a pontuação é zero. Porém, eles podem aumentar esse nível em 1.
//        Assim, devemos fornecer um método para realizar esse aumento. O usuário também pode receber um bônus,
//        ou seja, um valor extra que é acrescentado em sua pontuação.
//
//        UsuarioJogo
//        ----------------------------------------------
//        -nome: String
//        -nickname: String
//        -pontuacao: int
//        -nivel: int
//        ----------------------------------------------
//        +UsuarioJogo(nome: String, nickname: String)
//        +aumentarPontuacao(): void
//        +subirNivel(): void
//        +bonus( valor: int): void
//        ----------------------------------------------


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
