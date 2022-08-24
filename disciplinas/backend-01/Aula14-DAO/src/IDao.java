public interface IDao <T> {
    T salvar(T t);

    Medicamento buscar(Medicamento medicamento);

    T buscar(Integer t);

}

   
