*** Variables ***
${SITE}                             https://www.saucedemo.com/
${NAVEGADOR}                        Chrome
${CAMPO_USUARIO}                    css=#user-name
${USUARIO}                          standard_user
${CAMPO_SENHA}                      css=#password
${SENHA}                            secret_sauce
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


*** Keywords ***
Acessar o site
    Set Selenium Speed              0.25
    Open Browser                    ${SITE}                      ${NAVEGADOR}
    Maximize Browser Window 


Efetuar o login
    Input Text                      ${CAMPO_USUARIO}             ${USUARIO}
    Input Text                      ${CAMPO_SENHA}               ${SENHA}
    Click Element                   ${BOTAO_LOGIN}  

Adicionar o produto Sauce Labs Backpack ao carrinho
    Click Element                   ${BOTAO_ADD_TO_CART}

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

