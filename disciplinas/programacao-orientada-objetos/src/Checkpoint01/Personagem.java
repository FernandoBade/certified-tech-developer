package Checkpoint01;

public abstract class Personagem {

    //Dados necessários para a criação do personagem
    public String nome;
    public String classe;
    public String raca;
    public String sexo;
    public Integer nivel = 1;
    public Integer experiencia = 0;
    public String historia;
    public Integer forca;
    public Integer destreza;
    public Integer constituicao;
    public Integer inteligencia;
    public Integer sabedoria;
    public Integer carisma;
    public Integer totalDePontos;

    //Construtor completo, onde você pode distribuir os pontos de atriburo como quiser, seguindo as regras do jogo.
    public Personagem(
            String nome,
            String classe,
            String raca,
            String sexo,
            String historia,
            Integer forca,
            Integer destreza,
            Integer constituicao,
            Integer inteligencia,
            Integer sabedoria,
            Integer carisma
    ) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.sexo = sexo;
        this.historia = historia;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        totalDePontos = forca + destreza + constituicao + inteligencia + sabedoria + carisma;
        if (totalDePontos != 60) {
            throw new Error("O total de pontos em atributos deve ser 60");
        } else if (forca < 5 || destreza < 5 || constituicao < 5 || inteligencia < 5 || sabedoria < 5 || carisma < 5) {
            throw new Error("Os atributos iniciais devem ser maiores que 5");
        } else if (forca > 20 || destreza > 20 || constituicao > 20 || inteligencia > 20 || sabedoria > 20 || carisma > 20) {
            throw new Error("Os atributos iniciais não podem ser maiores do que 20");
        }
    }

    //Construtor basico, onde os pontos são distribuídos igualmente entre os atributos.
    public Personagem(String nome, String classe, String raca, String sexo, String historia) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.sexo = sexo;
        this.historia = historia;
        this.forca = 10;
        this.destreza = 10;
        this.constituicao = 10;
        this.inteligencia = 10;
        this.sabedoria = 10;
        this.carisma = 10;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer removerNivel() {
        return this.nivel--;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void ganharExperiencia(int experiencia) {
        this.experiencia += experiencia;
    }

    //Função que aumenta o nível do personagem de acordo com o total de experiência adquirida.
    public void subirDeNivel() {
        int experienciaNecessaria = 500 * (getNivel() ^ 2) - (500 * getNivel());
        if (getExperiencia() > experienciaNecessaria) {
            setNivel(getNivel() + (getExperiencia() / experienciaNecessaria) / 2 );
        }

        //A fóruma do cálculo da experiência é progressivo e segue o padrão de Dungeons&Dragons, onde o nível do personagem aumenta a
        //experiência total necessária para subir para o próximo nível, por exemplo:
        //Nível 1 = 0 pontos de experiência
        //Nível 2 = 1000 pontos de experiência
        //Nível 3 = 3000 pontos de experiência
        //Nível 4 = 6000 pontos de experiência
        //Nível 5 = 10000 pontos de experiência
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
