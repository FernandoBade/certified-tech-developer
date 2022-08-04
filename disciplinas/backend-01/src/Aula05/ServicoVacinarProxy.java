package Aula05;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{

    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        if (dataVacina.before(new Date())) {
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg, dataVacina, tipoVacina);
            System.out.println("O(a) portador(a) do RG "+rg+" foi vacinado com a vacina "+tipoVacina+" em "+dataVacina);
        } else {
            System.out.println("A data da vacinação não pode ser maior que a data atual.");
        }
    }
}
