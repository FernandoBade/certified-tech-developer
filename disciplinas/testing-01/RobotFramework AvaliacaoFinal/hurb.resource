*** Variables ***
${SITE}                                     https://hurb.com/br
${NAVEGADOR}                                Chrome
${ACEITE_COOKIES}                           xpath=/html/body/div[1]/div[2]/div/a[2]
${ABA_PACOTES}                              xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${INPUT_BUSCA_PACOTES}                      xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/input
${BTN_PESQUISAR}                            xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/button
${PACOTE_TOQUIO}                            xpath=/html/body/div[1]/div/main/section/div[1]/a
${BTN_ESCOLHER_PACOTE}                      xpath=/html/body/div[1]/div/main/div[3]/aside/div/div/div[2]/button
${RADIO_SAO_PAULO}                          xpath=//*[@id="LGPKG-1140178-2779861"]
${BTN_PROXIMO_1}                            xpath=/html/body/div[9]/div/div/div/footer/button
${OPCAO_7_DIARIAS}                          xpath=/html/body/div[9]/div/div/div/section/div/button[1]/div/div/div/p
${BTN_PROXIMO_2}                            xpath=/html/body/div[9]/div/div/div/footer/button[2]
${BTN_IR_PARA_PAGAMENTO}                    xpath=/html/body/div[9]/div/div/div/footer/button[2]


*** Keywords ***

Abrir o site do Hurb
    Set Selenium Speed              0.25
    Open Browser                    ${SITE}                                 ${NAVEGADOR}
    Maximize Browser Window

Clicar em “Permitir todos os cookies”
    Sleep                                   3
    Click Element                           ${ACEITE_COOKIES}

Selecionar a opção “Pacotes”
    Wait and Click                          ${ABA_PACOTES}

Buscar por "Tóquio"
    Input Text                              ${INPUT_BUSCA_PACOTES}          Tóquio
    Click Element                           ${BTN_PESQUISAR}

Selecionar um pacote de viagem
    Click Element                           ${PACOTE_TOQUIO}

Clicar em “Escolher pacote”
    Wait and Click                          ${BTN_ESCOLHER_PACOTE}

Selecionar a opção de saída a partir de São Paulo e avançar até os detalhes da viagem
    Click Element                           ${RADIO_SAO_PAULO}
    Wait and Click                          ${BTN_PROXIMO_1}
    Wait and Click                          ${OPCAO_7_DIARIAS}
    Wait and Click                          ${BTN_PROXIMO_2}
    Wait and Click                          ${BTN_IR_PARA_PAGAMENTO}
    
Validar as informações da “Configuração” da viagem
    Page Should Contain                     7 diárias\n1 pessoa por pacote

# Validar as informações do período da viagem


# Selecionar a opção “Boleto parcelado” (se não estiver disponível, escolha qualquer outro)


# Preencher os dados de pagamento


# Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”


# Validar a informação sobre cancelamento grátis

# personalizadas 

Wait and Click
    [Arguments]                             ${ELEMENTO}
    Wait Until Element is Visible           ${ELEMENTO}
    Click Element                           ${ELEMENTO}
