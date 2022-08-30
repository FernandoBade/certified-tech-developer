package com.ctdcommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @RequestMapping(value = "/findPedido", method = RequestMethod.GET)
    public String getPedidoAll(){
        return "Você buscou por todos os pedidos";
    }
}
