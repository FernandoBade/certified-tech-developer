*** Variables ***
${SITE}                             https://bugbank.netlify.app/
${NAVEGADOR}                        Chrome
${BOTAO_REGISTRAR}                  xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[3]/button[2]
${CAMPO_EMAIL}                      xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[2]/input
${EMAIL}                            fernando.tester@email.com
${CAMPO_NOME}                       xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[3]/input
${NOME}                             Fernando Bade
${CAMPO_CADASTRO_SENHA}             xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[4]/div/input
${CAMPO_CONFIRMACAO_SENHA}          xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[5]/div/input
${BOTAO_CRIAR_CONTA_COM_SALDO}      id=toggleAddBalance
${BOTAO_CADASTRAR}                  xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/button
${BOTAO_FECHAR}                     id=btnCloseModal
${CAMPO_USUARIO}                    xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[1]/input
${USUARIO}                          fernando.tester@email.com
${CAMPO_SENHA}                      xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[2]/div/input
${SENHA}                            123456
${BOTAO_LOGIN}                      xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[3]/button[1]
${BOTAO_EXTRATO}                    id=btn-EXTRATO
${LANCAMENTO_SALDO_INICIAL}         Saldo adicionado ao abrir conta
${BOTAO_VOLTAR}                     xpath=//*[@id="btnBack"]
${BOTAO_TRANSFERENCIA}              id=btn-TRANSFERÊNCIA
${CAMPO_NUMERO_DA_CONTA}            xpath=//*[@id="__next"]/div/div[3]/form/div[1]/div[1]/input
${NUMERO_DA_CONTA_INCORRETA}        999
${CAMPO_DIGITO_DA_CONTA}            xpath=//*[@id="__next"]/div/div[3]/form/div[1]/div[2]/input
${DIGITO_DA_CONTA}                  9
${CAMPO_VALOR_DA_TRANSFERENCIA}     xpath=//*[@id="__next"]/div/div[3]/form/div[2]/input
${VALOR_DA_TRANSFERENCIA}           100
${CAMPO_DESCRICAO}                  xpath=//*[@id="__next"]/div/div[3]/form/div[3]/input
${DESCRICAO_DA_TRANSFERENCIA}       Transferência de teste
${BOTAO_TRANSFERIR_AGORA}           xpath=//*[@id="__next"]/div/div[3]/form/button
${TEXTO_ERRO_CONTA_INVALIDA}        Conta inválida ou inexistente
${BOTAO_SAIR}                       id=btnExit


*** Keywords ***
Acessar o site
    Set Selenium Speed              0.25
    Open Browser                    ${SITE}                              ${NAVEGADOR}
    Maximize Browser Window 

Clicar em "Registrar"
    Click Element                   ${BOTAO_REGISTRAR}

Inserir email
    Input Text                      ${CAMPO_EMAIL}                       ${EMAIL}

Inserir nome
    Input Text                      ${CAMPO_NOME}                        ${NOME}

Inserir senha
    Input Text                      ${CAMPO_CADASTRO_SENHA}              ${SENHA}

Confirmar senha
    Input Text                      ${CAMPO_CONFIRMACAO_SENHA}           ${SENHA}

Escolher conta com saldo
    Click Element                   ${BOTAO_CRIAR_CONTA_COM_SALDO}

Clicar em Cadastrar
    Click Element                   ${BOTAO_CADASTRAR}

Fechar o modal de confirmação
    Click Element                   ${BOTAO_FECHAR}

Efetuar o login
    Input Text                      ${CAMPO_USUARIO}                    ${USUARIO}
    Input Text                      ${CAMPO_SENHA}                      ${SENHA}
    Click Element                   ${BOTAO_LOGIN}  

Clicar em extrato   
    Click Element                   ${BOTAO_EXTRATO}

Verificar saldo inicial
    Page Should Contain             ${LANCAMENTO_SALDO_INICIAL}

Voltar para o menu principal
    Click Element                   ${BOTAO_VOLTAR}

Acessar a área de transferência
    Click Element                   ${BOTAO_TRANSFERENCIA}

Inserir dados da conta de destino incorreta
    Input Text                      ${CAMPO_NUMERO_DA_CONTA}            ${NUMERO_DA_CONTA_INCORRETA}
    Input Text                      ${CAMPO_DIGITO_DA_CONTA}            ${DIGITO_DA_CONTA}

Inserir valor da transferência
    Input Text                      ${CAMPO_VALOR_DA_TRANSFERENCIA}     ${VALOR_DA_TRANSFERENCIA}

Inserir a descrição da transferência	
    Input Text                      ${CAMPO_DESCRICAO}                  ${DESCRICAO_DA_TRANSFERENCIA}

Clicar no botão "Transferir Agora"
    Click Element                   ${BOTAO_TRANSFERIR_AGORA}

Confere se ocorre o erro de conta inválida
    Page Should Contain             ${TEXTO_ERRO_CONTA_INVALIDA}
    Click Element                   ${BOTAO_FECHAR}

Efetuar logout da conta
    Click Element                   ${BOTAO_SAIR}
