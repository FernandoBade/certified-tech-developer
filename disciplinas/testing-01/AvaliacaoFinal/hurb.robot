# Fernando Ramos Bade - Turma 06

*** Settings ***

Library                     SeleniumLibrary
Resource                    ./hurb.resource
Test Setup                  Abrir o site do Hurb
# Test Teardown               Close Browser

*** Test Cases ***
Processo de reserva de pacote de viagens para Tóquio - Japão
    Clicar em “Permitir todos os cookies”
    Selecionar a opção “Pacotes”
    Buscar por "Tóquio"
    Selecionar um pacote de viagem
    Clicar em “Escolher pacote”
    Selecionar a opção de saída a partir de São Paulo
    Avançar e escolha a opção de 7 diárias
    Avançar para as configurações e pagamento
    Validar as informações: 7 dias, 1 pessoa por pacote, saída em 01 Mar 2023
    Selecionar a opção “Boleto parcelado”
    Preencher os dados de pagamento
    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Validar a informação sobre cancelamento grátis

