
*** Variables ***
${SITE}                                     https://hurb.com/br
${NAVEGADOR}                                Chrome
${ACEITE_COOKIES}                           xpath=/html/body/div[1]/div[2]/div/a[2]
${ABA_PACOTES}                              xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${INPUT_BUSCA_PACOTES}                      xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/input
${BTN_PESQUISAR}                            xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/button
${PACOTE_TOQUIO}                            css=#__next > div > main > section > div.ResultsCardsContainer_ResultsCardContainer__CDDwR > a > div.h-kr8vcn > div.h-1btkzqk > div
${BTN_ESCOLHER_PACOTE}                      xpath=/html/body/div[1]/div/main/div[3]/aside/div/div/div[2]/button
${RADIO_SAO_PAULO}                          xpath=//*[@id="LGPKG-1140178-2779861"]
${BTN_PROXIMO}                              xpath=//button[contains(.,'Próximo')]
${OPCAO_7_DIARIAS}                          css=.h-cqz66k:nth-child(1) .DailiesSelectionStep_MainContent__d5pMt
${BTN_IR_PARA_PAGAMENTO}                    xpath=//button[contains(.,'Ir para pagamento')]
${OPCAO_BOLETO_PARCELADO}                   xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/ul/li[3]/a
${INPUT_NOME_DO_PAGADOR}                    xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/div[2]/section/div[1]/div[1]/div/input
${INPUT_CPF_DO_PAGADOR}                     xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/div[2]/section/div[1]/div[2]/div/input
${INPUT_TELEFONE}                           xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/div[2]/section/div[2]/div[1]/div/input
${CHECKBOX_TERMOS_DE_USO}                   id=cancellation-policy


*** Keywords ***

Abrir o site do Hurb
    Set Selenium Speed                      0.25
    Open Browser                            ${SITE}                         ${NAVEGADOR}
    Maximize Browser Window

Clicar em “Permitir todos os cookies”
    Wait and Click                          ${ACEITE_COOKIES}

Selecionar a opção “Pacotes”
    Wait and Click                          ${ABA_PACOTES}

Buscar por "Tóquio"
    Input Text                              ${INPUT_BUSCA_PACOTES}          Tóquio
    Wait and Click                          ${BTN_PESQUISAR}
    
Selecionar um pacote de viagem
    Wait and Click                          ${PACOTE_TOQUIO}
    Switch Window                           NEW

Clicar em “Escolher pacote”
    Wait and Click                          ${BTN_ESCOLHER_PACOTE}

Selecionar a opção de saída a partir de São Paulo
    Wait and Click                          ${RADIO_SAO_PAULO}   

Avançar e escolha a opção de 7 diárias
    Wait and Click                          ${BTN_PROXIMO}
    Wait and Click                          ${OPCAO_7_DIARIAS}

Avançar para as configurações e pagamento
    Wait and Click                          ${BTN_PROXIMO}
    Wait and Click                          ${BTN_IR_PARA_PAGAMENTO}

Validar as informações: 7 dias, 1 pessoa por pacote, saída em 01 Mar 2023
    Sleep                                   3
    Page Should Contain                     7 diárias
    Page Should Contain                     1 pessoa por pacote
    Page Should Contain                     01 Mar 2023

Selecionar a opção “Boleto parcelado”
    Wait and Click                          ${OPCAO_BOLETO_PARCELADO}

Preencher os dados de pagamento
    Input Text                              ${INPUT_NOME_DO_PAGADOR}        Fernando Bade
    Input Text                              ${INPUT_CPF_DO_PAGADOR}         10443648077
    Input Text                              ${INPUT_TELEFONE}               11987654321

Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Select Checkbox                         ${CHECKBOX_TERMOS_DE_USO}

Validar a informação sobre cancelamento grátis
    Page Should Contain                     Cancelamento Grátis!

# personalizadas 

Wait and Click
    [Arguments]                             ${ELEMENTO}
    Wait Until Element is Visible           ${ELEMENTO}
    Click Element                           ${ELEMENTO}
