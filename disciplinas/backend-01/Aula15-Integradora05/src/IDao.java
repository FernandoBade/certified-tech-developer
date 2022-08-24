public interface IDao<T> {

    Endereco salvar(Endereco endereco);

    T cadastrar(T t);

    T buscar(Integer t);

    T excluir(Integer t);

    T modificar(T t);

}
