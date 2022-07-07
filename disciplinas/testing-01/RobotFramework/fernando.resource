*** Variables ***
${SITE}                             https://www.saucedemo.com/
${NAVEGADOR}                        Chrome
${CAMPO_USUARIO}                    css=#user-name
${USUARIO}                          standard_user
${USUARIO_INCORRETO}                PÃO DE BATATA
${CAMPO_SENHA}                      css=#password
${SENHA}                            secret_sauce
${SENHA_INCORRETA}                  TÃTÃTÃ
${BOTAO_LOGIN}                      css=#login-button
${BOTAO_ADD_TO_CART}                css=#add-to-cart-sauce-labs-backpack
${BOTAO_CARRINHO}                   css=#shopping_cart_container > a
${BOTAO_CHECKOUT}                   css=#checkout
${CAMPO_FIRST_NAME}                 css=#first-name
${NOME}                             Fernando
${CAMPO_LAST_NAME}                  css=#last-name
${SOBRENOME}                        Bade
${CAMPO_CEP}                        css=#postal-code
${CEP}                              123456-000
${BOTAO_CONTINUE}                   css=#continue
${BOTAO_FINISH}                     css=#finish
${MENSAGEM_AGRADECIMENTO}           THANK YOU FOR YOUR ORDER
${MENSAGEM_ERRO}                    Username and password do not match any user in this service


*** Keywords ***
Acessar o site
    Set Selenium Speed              0.1
    Open Browser                    ${SITE}                      ${NAVEGADOR}
    Maximize Browser Window 

Efetuar o login
    Input Text                      ${CAMPO_USUARIO}             ${USUARIO}
    Input Text                      ${CAMPO_SENHA}               ${SENHA}
    Click Element                   ${BOTAO_LOGIN}  

Adicionar o produto Sauce Labs Backpack ao carrinho
    Wait and Click                  ${BOTAO_ADD_TO_CART}

Acessar o carrinho
    Click Element                   ${BOTAO_CARRINHO}

Efetuar o checkout
    Click Element                   ${BOTAO_CHECKOUT}

Adicionar os dados do cliente
    Input Text                      ${CAMPO_FIRST_NAME}           ${NOME}
    Input Text                      ${CAMPO_LAST_NAME}            ${SOBRENOME}
    Input Text                      ${CAMPO_CEP}                  ${CEP}

Confirmar o pedido
    Click Element                   ${BOTAO_CONTINUE}

Finalizar o pedido
    Click Element                   ${BOTAO_FINISH}
    Page Should Contain             ${MENSAGEM_AGRADECIMENTO}

Wait and Click
    [Arguments]                     ${ELEMENTO}
    Wait Until Element is Visible   ${ELEMENTO}
    Click Element                   ${ELEMENTO}
    

Efetuar o login com usuário incorreto
    Input Text                      ${CAMPO_USUARIO}             ${USUARIO_INCORRETO}
    Input Text                      ${CAMPO_SENHA}               ${SENHA_INCORRETA}
    Click Element                   ${BOTAO_LOGIN}  
    Page Should Contain             ${MENSAGEM_ERRO}