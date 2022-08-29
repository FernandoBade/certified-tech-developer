package com.ctdcommerce.dao;

import com.ctdcommerce.model.Produdo;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {

    Produdo salvar(Produdo produto) throws SQLException;

    List<T> buscarTodos () throws SQLException;

    void alterar (T t) throws SQLException;

    Optional<T> buscarPorId(int id) throws SQLException;

    void excluir(int id) throws SQLException;

}
