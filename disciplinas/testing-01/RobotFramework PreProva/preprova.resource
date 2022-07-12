*** Variables ***
${SITE}                                     https://digitalhouse.com/br
${NAVEGADOR}                                Chrome

${BOTAO_COOKIES}                            xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]


*** Keywords ***
Abrir o novo site da Digital House Brasil
    Open Browser                            ${SITE}                              ${NAVEGADOR}
    Maximize Browser Window

Clicar em “Aceitar Cookies”
  Sleep  5

  Wait and Click                            ${BOTAO_COOKIES}
  Unselect Frame

Wait and Click
  [Arguments]                               ${ELEMENTO}
  Wait Until Element is Visible             ${ELEMENTO}
  Click Element                             ${ELEMENTO}
