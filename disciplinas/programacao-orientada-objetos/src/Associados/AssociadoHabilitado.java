package Associados;

public class AssociadoHabilitado extends Associado {
    private final double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(
            String numeroAssociado,
            String nome,
            Double valorMensal,
            String atividade,
            double custoPiscina
    ) {
        super(numeroAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
        this.habilitado = false;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Double custoMensal() {
        if (habilitado) {
            return super.custoMensal() + custoPiscina;
        } else {
            return super.custoMensal();
        }
    }
}
