*** Settings ***
Library                             SeleniumLibrary
Resource                            ./bugbank.resource
# Test Teardown                       Close Browser

*** Test Cases ***

Registrar um novo usuário
    Acessar o site
    Clicar em "Registrar"
    Inserir email
    Inserir nome
    Inserir senha
    Confirmar senha
    Escolher conta com saldo
    Clicar em Cadastrar
    Fechar o modal de confirmação

Login no app do Bugbank
    Efetuar o login

Efetuar uma transferência para conta inválida
    Clicar em extrato
    Verificar saldo inicial
    Voltar para o menu principal
    Acessar a área de transferência
    Inserir dados da conta de destino incorreta
    Inserir valor da transferência
    Inserir a descrição da transferência	
    Clicar no botão "Transferir Agora"
    Confere se ocorre o erro de conta inválida
    Efetuar logout da conta
    

