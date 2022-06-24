package Paciente;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao)
    {   LocalDate hoje = LocalDate.of(2021, 5, 10)
            ;
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        this.dataInternacao = dataInternacao;
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta)    {
        try {
            if (dataInternacao.isAfter(dataAlta))
                System.out.println("Ok");
            else
                throw new DateException();
        }
        catch (DateException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
