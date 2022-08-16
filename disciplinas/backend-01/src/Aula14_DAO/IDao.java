package Aula14_DAO;

public interface IDao <T> {
    T salvar(T t);
    T buscar(T t);

    Medicamento salvar(Medicamento medicamento);

    Medicamento buscar(Medicamento medicamento);
}
