package Aula10_Logging;

import org.apache.log4j.Logger;

public class Leao {

    private static final Logger logger = Logger.getLogger(Leao.class);
    private String nome;
    private int idade;
    private boolean ehAlfa;

    public Leao(String nome, int idade, boolean ehAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.ehAlfa = ehAlfa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEhAlfa() {
        return ehAlfa;
    }

    public void setEhAlfa(boolean ehAlfa) {
        this.ehAlfa = ehAlfa;
    }

    public void correr() {
        logger.info("O leão " + nome + " está correndo!");
    }

    public void ehMaiorQue10() throws Exception {
        if (idade >= 10 && ehAlfa) {
            logger.info("O leão " + nome + " tem mais de 10 anos.");

        } else {
            logger.info("A idade e/ou característica de alfa do leão " + nome + " não é válida.");
        }
        if (idade < 0) {
            logger.error("A idade do leão " + nome + " é menor do que zero.");
            throw new Exception();
        }
    }
}
