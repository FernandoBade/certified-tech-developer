## Enunciado

Uma cl�nica odontol�gica precisa informatizar suas opera��es. Por isso, nos pedem um sistema para
gerenciamento de seus pacientes, onde possam cadastr�-los, busc�-los, exclu�-los e modific�-los.\
Ao cadastrar um paciente, os seguintes dados ser�o solicitados:

    -Nome
    -Sobrenome
    -RG
    -Data de cadastro
    -Endere�o
        - Rua
        - N�mero
        - Cidade
        - Bairro

Al�m disso, adicionaremos um ID com auto-incremento para pacientes e endere�os.
Utilize o H2 como banco de dados, aplicando o padr�o DAO e testes com o JUnit.
Lembre que a modelagem dos dados deve ter no m�nimo 2 classes, Paciente e Endere�o.

Antes de iniciar os testes unit�rios, salve no banco de dados 2 ou mais pacientes com seus respectivos endere�os.

### Utilizando a camada de servi�o:

    - Adicione um paciente com endere�o e pesquise no banco de dados pelo ID;
    - Exclua o paciente criado anteriormente e procure-o;
    - Pesquise e imprima no console todos os pacientes com seus endere�os, ser�o listados todos os pacientes que inclu�mos antes de realizar o primeiro teste.