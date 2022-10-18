package com.example.Injecao_Dependencias1.service.impl;

import com.example.Injecao_Dependencias1.dto.LivroDTO;
import com.example.Injecao_Dependencias1.entity.LivroEntity;
import com.example.Injecao_Dependencias1.repository.ILivroRepository;
import com.example.Injecao_Dependencias1.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements ILivroService {

    @Autowired
    //ele faz com que a injeção de dependência funcione
    //quando utilizamos o @Autowired ele faz os instanciamentos sozinhos e o
    //próprio spring vai tratar desses instanciamentos
    //deixa o código mais enxuto e muito mais limpo
    private ILivroRepository livroRepository;

    @Override
    public List<LivroDTO> buscarTodosLivros(){
        List<LivroDTO> response;
        List<LivroEntity> livroEntityList = this.livroRepository.buscarTodosLivros();

        response = livroEntityList.stream().map(LivroDTO::new).collect(Collectors.toList());
        //usamos essa fórmula para preencher a nossa lista que é o stream(recurso do java)
        //que vai percorrer a lista e vamos fazer o mapeamento para cada um dos itens da nossa lista
        //vamos criar um novo DTO e depois ele joga essa coleção para uma lista
        //essa lista de DTO vai ser mandada para o controller
        return response;
    }
}
