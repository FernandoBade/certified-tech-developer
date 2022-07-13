
*** Variables ***
${SITE}                                     https://hurb.com/br
${NAVEGADOR}                                Chrome
${ACEITE_COOKIES}                           xpath=/html/body/div[1]/div[2]/div/a[2]
${ABA_PACOTES}                              xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${INPUT_BUSCA_PACOTES}                      xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/input
${BTN_PESQUISAR}                            xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/button
${PACOTE_TOQUIO}                            css=#__next > div > main > section > div.ResultsCardsContainer_ResultsCardContainer__CDDwR > a > div.h-kr8vcn > div.h-1btkzqk > div
${PACOTE_BANGKOK}                           css=#__next > div > main > section > div.ResultsCardsContainer_ResultsCardContainer__CDDwR > a:nth-child(2)
${PACOTE_HAVANA}                            css=.Packages_PackageCard__PhHJm:nth-child(1) .h-6zedh8
${PACOTE_PRAGA}                             css=.h-6zedh8
${BTN_ESCOLHER_PACOTE}                      xpath=/html/body/div[1]/div/main/div[3]/aside/div/div/div[2]/button
${RADIO_SAO_PAULO_1}                        xpath=//*[@id="LGPKG-1140178-2779861"]
${RADIO_SAO_PAULO_2}                        xpath=//*[@id="LGPKG-1095525-2723884"]
${RADIO_SAO_PAULO_3}                        xpath=//*[@id="LGPKG-1140131-2779690"]
${RADIO_SAO_PAULO_4}                        xpath=//*[@id='LGPKG-1100865-2730788']
${BTN_PROXIMO}                              xpath=//button[contains(.,'Próximo')]
${OPCAO_6_DIARIAS}                          css=.h-cqz66k:nth-child(1) .h-1y6jkyf
${OPCAO_7_DIARIAS}                          css=.h-cqz66k:nth-child(1) .DailiesSelectionStep_MainContent__d5pMt
${OPCAO_8_DIARIAS}                          css=.h-1y6jkyf
${OPCAO_9_DIARIAS}                          css=.h-1qtjbr3
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
    
Selecionar o pacote de viagem 1
    Wait and Click                          ${PACOTE_TOQUIO}
    Switch Window                           NEW

Clicar em “Escolher pacote”
    Wait and Click                          ${BTN_ESCOLHER_PACOTE}

TÓQUIO_Selecionar a opção de saída a partir de São Paulo
    Wait and Click                          ${RADIO_SAO_PAULO_1}  

Avançar e escolher a opção de 7 diárias
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
    Execute Javascript                      window.scroll(0,500)
    Select Checkbox                         ${CHECKBOX_TERMOS_DE_USO}

Validar a informação sobre cancelamento grátis
    Page Should Contain                     Cancelamento Grátis!

Buscar por "Bangkok"
    Input Text                              ${INPUT_BUSCA_PACOTES}          Bangkok
    Wait and Click                          ${BTN_PESQUISAR}

Selecionar o pacote de viagem 2
    Wait and Click                          ${PACOTE_BANGKOK}
    Switch Window                           NEW

BANGKOK_Selecionar a opção de saída a partir de São Paulo
    Wait and Click                          ${RADIO_SAO_PAULO_2}

Avançar e escolher a opção de 8 diárias
    Wait and Click                          ${BTN_PROXIMO}
    Wait and Click                          ${OPCAO_8_DIARIAS}

Validar as informações: 8 dias, 1 pessoa por pacote, saída em 15 Set 2022
    Sleep                                   2
    Page Should Contain                     8 diárias
    Page Should Contain                     1 pessoa por pacote
    Page Should Contain                     15 Set 2022

Buscar por "Havana"
    Input Text                              ${INPUT_BUSCA_PACOTES}          Havana
    Wait and Click                          ${BTN_PESQUISAR}

Selecionar o pacote de viagem 3
    Wait and Click                          ${PACOTE_HAVANA}
    Switch Window                           NEW

HAVANA_Selecionar a opção de saída a partir de São Paulo
    Wait and Click                          ${RADIO_SAO_PAULO_3}

Avançar e escolher a opção de 6 diárias
    Wait and Click                          ${BTN_PROXIMO}
    Wait and Click                          ${OPCAO_6_DIARIAS}

Validar as informações: 6 dias, 1 pessoa por pacote, saída em 01 Mar 2023
    Sleep                                   2
    Page Should Contain                     6 diárias
    Page Should Contain                     1 pessoa por pacote
    Page Should Contain                     01 Mar 2023

Buscar por "Praga"
    Input Text                              ${INPUT_BUSCA_PACOTES}          Praga
    Wait and Click                          ${BTN_PESQUISAR}

Selecionar o pacote de viagem 4
    Wait and Click                          ${PACOTE_PRAGA}
    Switch Window                           NEW

PRAGA_Selecionar a opção de saída a partir de São Paulo
    Wait and Click                          ${RADIO_SAO_PAULO_4}

Avançar e escolher a opção de 9 diárias
    Wait and Click                          ${BTN_PROXIMO}
    Wait and Click                          ${OPCAO_9_DIARIAS}

Validar as informações: 9 dias, 1 pessoa por pacote, saída em 15 Set 2022
    Sleep                                   2
    Page Should Contain                     9 diárias
    Page Should Contain                     1 pessoa por pacote
    Page Should Contain                     15 Set 2022

# personalizadas 

Wait and Click
    [Arguments]                             ${ELEMENTO}
    Wait Until Element is Visible           ${ELEMENTO}
    Click Element                           ${ELEMENTO}
