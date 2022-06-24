package Porto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Porto {
    public String nome;
    public List<Container> containers;

    public Porto(String nome, List<Container> containers) {
        this.nome = nome;
        this.containers = containers;
    }

    public String getNome() {
        return nome;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public int ContainersPerigososDeOrigemDesconhecida() {
        int i = 0;
        for (Container container : containers) {
            if (container.isPerigoso() && container.getPais().equals("Desconhecido")) {
                i++;
            }
        }
        return i;
    }

    public Boolean permitirEntradaDeContainer(Container container) {
        return !container.getPais().equals("Desconhecido");
    }

    public void adicionarContainer(Container container) {
        containers.add(container);
    }

    public void removerContainer(Container container) {
        containers.remove(container);
    }

    @Override
    public String toString() {
        return "Porto: " + nome + System.lineSeparator()
                + "Total de containers: " + containers + System.lineSeparator()
                + "Total de Containers Perigosos de Origem Desconhecida: " + ContainersPerigososDeOrigemDesconhecida() + System.lineSeparator();
    }

    public void ordenarContainersPorNumero() {
        containers.sort(new Comparator<Container>() {
            @Override
            public int compare(Container o1, Container o2) {
                return o1.getNumero().compareTo(o2.getNumero());
            }
        });
    }

}
