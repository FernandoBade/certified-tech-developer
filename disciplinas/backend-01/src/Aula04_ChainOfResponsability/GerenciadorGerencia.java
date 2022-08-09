package Aula04_ChainOfResponsability;

public class GerenciadorGerencia extends Gerenciador {

    @Override
    public void verificar(Mail email) {
        if (email.getDestino().equalsIgnoreCase("gerencia@colmeia.com") || email.getAssunto().equalsIgnoreCase("gerencia")) {
            System.out.println("Enviado ao Departamento Gerencial.");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}