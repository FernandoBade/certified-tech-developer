public class GerenciadorTecnico extends Gerenciador {
    public GerenciadorTecnico() {
        super();
    }

    public void verificar(Mail email) {
        if (email.getDestino().equalsIgnoreCase("tecnica@colmeia.com") || email.getAssunto().equalsIgnoreCase("tecnica")) {
            System.out.println("Enviado ao Departamento Técnico.");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
}
}
