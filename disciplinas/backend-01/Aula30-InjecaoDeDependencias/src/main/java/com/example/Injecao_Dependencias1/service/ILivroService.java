package com.example.Injecao_Dependencias1.service;

import java.util.List;

public interface ILivroService<T>{

    public List<T> buscarTodosLivros();

}
