package Aula08_Facade.Mesa;

public interface IFacadeBuscas {
     Viagem buscarPacote(String destino, String dataIda, String dataVolta);

    Viagem buscarPacote(Viagem viagem);
}
