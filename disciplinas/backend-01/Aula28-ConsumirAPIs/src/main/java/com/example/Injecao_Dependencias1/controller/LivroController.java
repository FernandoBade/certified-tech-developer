package com.example.Injecao_Dependencias1.controller;

import com.example.Injecao_Dependencias1.entity.LivroEntity;
import com.example.Injecao_Dependencias1.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private ILivroService livroService;

    @GetMapping("/livros")
    public List<LivroEntity> buscarTodosLivros(){
        return livroService.buscarTodosLivros();
    }
}
