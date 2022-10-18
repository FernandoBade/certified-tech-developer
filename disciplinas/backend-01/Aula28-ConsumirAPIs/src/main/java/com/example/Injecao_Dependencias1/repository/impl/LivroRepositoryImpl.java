package com.example.Injecao_Dependencias1.repository.impl;

import com.example.Injecao_Dependencias1.entity.LivroEntity;
import com.example.Injecao_Dependencias1.repository.ILivroRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class LivroRepositoryImpl implements ILivroRepository {

    @Override
    public List<LivroEntity> buscarTodosLivros(){
        List<LivroEntity> livroEntityList = new ArrayList<>();
        livroEntityList.add(new LivroEntity(1,"Clean Code","Robert C. Martin"));
        livroEntityList.add(new LivroEntity(2,"Marley & Eu","Arivaldo Camargo"));

        return livroEntityList;
    }
}
