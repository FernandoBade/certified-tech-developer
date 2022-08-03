package Aula04;

public class GerenciadorComercial extends Gerenciador {

    @Override
    public void verificar(Mail email) {
        if (email.getDestino().equalsIgnoreCase("comercial@colmeia.com") || email.getAssunto().equalsIgnoreCase("comercial")) {
            System.out.println("Enviado ao Departamento Comercial.");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}