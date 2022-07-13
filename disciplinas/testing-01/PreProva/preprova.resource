*** Variables ***
${SITE}                                     https://digitalhouse.com/br
${NAVEGADOR}                                Chrome
${OUTROS_CURSOS}                            css=#__next > div > main > section > div > div.mt-8.flex.justify-center > div > a
${DATA_ANALYTICS}                           xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[3]/a
${CHAMADA_DATA_ANALYTICS}                   voltado para qualquer pessoa que deseja ampliar suas capacidades analíticas
${DESCRICAO_DATA_ANALYTICS}                 Esse curso é voltado para qualquer pessoa e/ou profissional que queira ampliar suas capacidades analíticas para tomar as melhores decisões estratégicas em sua empresa, não importa em qual momento da vida esteja.
${BTN_INSCREVA_SE_AGORA}                    xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[2]/div[1]/a
${BTN_INSCREVA_SE}                          xpath=//*[@id="0"]/div/a
${DATA_SCIENCE}                             xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[4]/a/span
${CHAMADA_DATA_SCIENCE}                     voltado para estudantes e profissionais de diversas áreas que desejam melhorar sua comunicação como engenheiros de Big Data


*** Keywords ***
Abrir o novo site da Digital House Brasil
    Open Browser                            ${SITE}                              ${NAVEGADOR}
    Maximize Browser Window

DA.Clicar em “Ver outros cursos”
    Execute Javascript                      window.scroll(0,900)
    Wait and Click                          ${OUTROS_CURSOS}

Selecionar o curso “Data Analytics”
    Execute Javascript                      window.scroll(0,900)
    Wait and Click                          ${DATA_ANALYTICS}

Verificar se o texto de chamada do curso Data Analytics está correta
    Page Should Contain                     ${CHAMADA_DATA_ANALYTICS}

Verificar se a descrição do curso Data Analytics está correta
    Page Should Contain                     ${DESCRICAO_DATA_ANALYTICS}

Clicar em “Inscreva-se agora
    Wait and Click                          ${BTN_INSCREVA_SE_AGORA}

Clicar em “Inscreva-se”
    Execute Javascript                      window.scroll(0,3000)
    Wait and Click                          ${BTN_INSCREVA_SE}

Validar que o valor do curso é “R$10.315”
    Page Should Contain                     R$10.315


Ds.Clicar em “Ver outros cursos”
    Execute Javascript                      window.scroll(0,900)
    Wait and Click                          ${OUTROS_CURSOS}

Selecionar o curso “Data Science”
    Execute Javascript                      window.scroll(0,900)
    Wait and Click                          ${DATA_SCIENCE}

Verificar se o texto de chamada do curso Data Science está correta
    Page Should Contain                     ${CHAMADA_DATA_SCIENCE} 

Wait and Click
    [Arguments]                             ${ELEMENTO}
    Wait Until Element is Visible           ${ELEMENTO}
    Click Element                           ${ELEMENTO}
