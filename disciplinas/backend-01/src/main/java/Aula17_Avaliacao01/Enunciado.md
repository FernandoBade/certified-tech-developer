# Avalia��o Parcial 01

## Enunciado

Uma rede de hot�is est� solicitando para desenvolvermos uma funcionalidade de
gerenciamento de suas filiais. Em outras palavras, o sistema dever� permitir que elas sejam
cadastradas em um banco de dados.

Ap�s o levantamento realizado, obtivemos as seguintes informa��es que uma filial deve ter:


    - Id;
    - Nome da filial;
    - Rua;
    - N�mero;
    - Cidade;
    - Estado;
    - � 5 estrelas.

Nosso l�der de arquitetura nos orienta para:

1. Usar o H2 como banco de dados aplicando o padr�o DAO para manipular os dados e <br>executar os m�todos necess�rios para que nos permita salvar um n�mero indeterminado de filiais;
2. Registrar a execu��o de cada opera��o utilizando Log4j;
