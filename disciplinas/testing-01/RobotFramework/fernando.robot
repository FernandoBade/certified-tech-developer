*** Settings ***
Library                             SeleniumLibrary
Resource                            ./fernando.resource
Test Teardown                       Close Browser

*** Test Cases ***

Login e compra completa na loja Sauce Demo
    Acessar o site
    Efetuar o login
    Adicionar o produto Sauce Labs Backpack ao carrinho
    Acessar o carrinho
    Efetuar o checkout
    Adicionar os dados do cliente
    Confirmar o pedido
    Finalizar o pedido

Processo de compra na loja Sauce Demo com usuário negativo
    Acessar o site
    Efetuar o login com usuário incorreto

