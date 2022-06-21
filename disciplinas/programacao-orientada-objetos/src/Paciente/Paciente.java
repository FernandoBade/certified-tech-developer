package Paciente;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao)
    {   LocalDate hoje = LocalDate.of(2021, 5, 10)
            ;
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.(hoje))
            this.dataInternacao=dataInternacao;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta)    {
        try {
            if (dataAlta.after(dataInternacao))
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
