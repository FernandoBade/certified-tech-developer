package com.ctdcommerce.controller;


import com.ctdcommerce.model.Produto;
import com.ctdcommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/produto")

public class ProdutoControler {

    @Autowired
    ProdutoService service;

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) throws SQLException {
        return service.salvar(produto);
    }

    @GetMapping
    public List<Produto> buscarTodos() throws SQLException {
        return service.buscarTodos();
    }

    @RequestMapping(value = "/buscaID")
    public Produto buscarPorId(@RequestParam("id") int id) throws SQLException {
        return service.buscarPorId(id).isEmpty() ? new Produto() : service.buscarPorId(id).get();
    }

    @PatchMapping
    public void alterar(@RequestBody Produto produto) throws SQLException {
        System.out.println();
        service.alterar(produto);
    }

    @DeleteMapping
    public void excluir(@RequestParam("id") int id) throws SQLException {
        service.excluir(id);
    }

}
