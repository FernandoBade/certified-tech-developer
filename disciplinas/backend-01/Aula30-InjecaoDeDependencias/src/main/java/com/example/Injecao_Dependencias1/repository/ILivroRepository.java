package com.example.Injecao_Dependencias1.repository;

import java.util.List;

public interface ILivroRepository<T> {

    public List<T> buscarTodosLivros();
}
