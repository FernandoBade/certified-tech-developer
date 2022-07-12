*** Settings ***
Library                     SeleniumLibrary
Resource                    ./preprova.resource
Test Setup                  Abrir o novo site da Digital House Brasil
Test Teardown               Close Browser

*** Test Cases ***
Validação das informações do curso de Data Analytics
    DA.Clicar em “Ver outros cursos”
    Selecionar o curso “Data Analytics”
    Verificar se o texto de chamada do curso Data Analytics está correta
    Verificar se a descrição do curso Data Analytics está correta
    Clicar em “Inscreva-se agora
    Clicar em “Inscreva-se”
    Validar que o valor do curso é “R$10.315”

Validação das informações do curso de Data Science
    DS.Clicar em “Ver outros cursos”
    Selecionar o curso “Data Science”
    Verificar se o texto de chamada do curso Data Science está correta
