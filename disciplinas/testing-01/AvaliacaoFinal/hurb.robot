# Fernando Ramos Bade - Turma 06

*** Settings ***

Library                     SeleniumLibrary
Resource                    ./hurb.resource
Test Setup                  Abrir o site do Hurb
Test Teardown               Close Browser

*** Test Cases ***
Processo de reserva de pacote de viagens para Tóquio - Japão
    Clicar em “Permitir todos os cookies”
    Selecionar a opção “Pacotes”
    Buscar por "Tóquio"
    Selecionar o pacote de viagem 1
    Clicar em “Escolher pacote”
    TÓQUIO_Selecionar a opção de saída a partir de São Paulo
    Avançar e escolher a opção de 7 diárias
    Avançar para as configurações e pagamento
    Validar as informações: 7 dias, 1 pessoa por pacote, saída em 01 Mar 2023
    Selecionar a opção “Boleto parcelado”
    Preencher os dados de pagamento
    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Validar a informação sobre cancelamento grátis

Processo de reserva de pacote de viagens para Bangkok - Tailândia
    Clicar em “Permitir todos os cookies”
    Selecionar a opção “Pacotes”
    Buscar por "Bangkok"
    Selecionar o pacote de viagem 2
    Clicar em “Escolher pacote”
    BANGKOK_Selecionar a opção de saída a partir de São Paulo
    Avançar e escolher a opção de 8 diárias
    Avançar para as configurações e pagamento
    Validar as informações: 8 dias, 1 pessoa por pacote, saída em 15 Set 2022
    Selecionar a opção “Boleto parcelado”
    Preencher os dados de pagamento
    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Validar a informação sobre cancelamento grátis

Processo de reserva de pacote de viagens para Havana - Cuba
    Clicar em “Permitir todos os cookies”
    Selecionar a opção “Pacotes”
    Buscar por "Havana"
    Selecionar o pacote de viagem 3
    Clicar em “Escolher pacote”
    HAVANA_Selecionar a opção de saída a partir de São Paulo
    Avançar e escolher a opção de 6 diárias
    Avançar para as configurações e pagamento
    Validar as informações: 6 dias, 1 pessoa por pacote, saída em 01 Mar 2023
    Selecionar a opção “Boleto parcelado”
    Preencher os dados de pagamento
    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Validar a informação sobre cancelamento grátis

Processo de reserva de pacote de viagens para Praga - República Checa
    Clicar em “Permitir todos os cookies”
    Selecionar a opção “Pacotes”
    Buscar por "Praga"
    Selecionar o pacote de viagem 4
    Clicar em “Escolher pacote”
    PRAGA_Selecionar a opção de saída a partir de São Paulo
    Avançar e escolher a opção de 9 diárias
    Avançar para as configurações e pagamento
    Validar as informações: 9 dias, 1 pessoa por pacote, saída em 15 Set 2022
    Selecionar a opção “Boleto parcelado”
    Preencher os dados de pagamento
    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Validar a informação sobre cancelamento grátis