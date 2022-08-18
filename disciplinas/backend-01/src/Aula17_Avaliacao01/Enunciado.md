# Avaliação Parcial 01

## Enunciado

Uma rede de hotéis está solicitando para desenvolvermos uma funcionalidade de
gerenciamento de suas filiais. Em outras palavras, o sistema deverá permitir que elas sejam
cadastradas em um banco de dados.

Após o levantamento realizado, obtivemos as seguintes informações que uma filial deve ter:


    - Id;
    - Nome da filial;
    - Rua;
    - Número;
    - Cidade;
    - Estado;
    - É 5 estrelas.

Nosso líder de arquitetura nos orienta para:

1. Usar o H2 como banco de dados aplicando o padrão DAO para manipular os dados e <br>executar os métodos necessários para que nos permita salvar um número indeterminado de filiais;
2. Registrar a execução de cada operação utilizando Log4j;
