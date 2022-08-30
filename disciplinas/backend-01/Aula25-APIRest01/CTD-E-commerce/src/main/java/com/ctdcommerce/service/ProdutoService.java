package com.ctdcommerce.service;

import com.ctdcommerce.dao.IDao;
import com.ctdcommerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    IDao<Produto> produtoIDAOH2;

    public Produto salvar(Produto produto) throws SQLException {
        return produtoIDAOH2.salvar(produto);
    }

    public List<Produto> buscarTodos() throws SQLException {
        return produtoIDAOH2.buscarTodos();
    }

    public void alterar(Produto produto) throws SQLException {
        produtoIDAOH2.alterar(produto);
    }

    public void excluir(int id) throws SQLException {
        produtoIDAOH2.excluir(id);
    }

    public Optional<Produto> buscarPorId(int id) throws SQLException {
        return produtoIDAOH2.buscarPorId(id);
    }
}
