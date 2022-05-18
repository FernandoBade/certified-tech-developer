## Ciclo de vida de um defeito

1) Novo/Inicial;
2) Atribuído;
3) Em Progresso:
4) Corrigido;
5) Aguardando verificação;
6) Em verificação;
7) Verificado;
8) Fechado.


# RELATÓRIO DE DEFEITOS


## Identificador:
*003*

#### Título:
Ao clicar em qualquer área na mesma linha do botão de upload, ele ativa novamente o botão.

#### Descrição:

Ao lado do botão de “Escolher arquivo” possui um display que exibe o nome do arquivo de imagem selecionado. Nesta mesma linha, horizontalmente, qualquer clique nesta área  reabre a janela de upload e 
em caso de fechamento desta janela, ela sofre um reset que exclui a imagem selecionada previamente.

#### Data do relatório de defeito:
17/05/2022 – 22h19

#### Autor:
Fernando Bade

#### Identificação do Elemento Teste:
https://demoqa.com/upload-download

#### Versão
N/A

#### Ambiente
- Windows 10 Pro - Versão 21H1 - Experiência Windows Feature Experience Pack 120.2212.4170.0;
- Chrome Versão 101.0.4951.67 (Versão oficial) 64 bits.

#### Passos para reprodução:
- ClLicar no botão “Escolher arquivo”, sob a etiqueta “Select a file”;
- Selecione um arquivo de imagem .jpeg e clique em “Abrir”;
- Clique no nome do arquivo selecionado, ao lado do botão “Escolher arquivo”, ou ainda, em qualquer área na mesma linha horizontal deste botão;
- Clique em cancelar na nova janela que será aberta, não selecionando nenhuma imagem.

#### Resultado esperado:
Não deveria haver nenhuma ação ao clicar no nome do arquivo ou na extensão horizontal  do botão para enviar imagem.

#### Resultado obtido:
Ativação por clique em toda a extensão horizontal do botão, e quando cancelada a nova ação, a imagem selecionada anteriormente desaparece.

#### Criticidade:
*Alta*

#### Prioridade:
*Alta*

#### Status do defeito:
Novo

