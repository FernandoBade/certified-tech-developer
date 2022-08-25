package com.veiculo.veiculo.service.impl;

import com.veiculo.veiculo.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService{


    @Override
    public List<Veiculo> veiculos() {
        return Arrays.asList(new Veiculo("Uno", "Fiat", "uno.jpg"), new Veiculo("Celta", "Chevrolet", "celta.jpg"));
    }
}