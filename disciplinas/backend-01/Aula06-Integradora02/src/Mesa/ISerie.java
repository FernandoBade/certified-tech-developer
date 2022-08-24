//Enunciado
//        Agora nosso aplicativo de streaming vai incorporar a transmiss�o de s�ries. Nesse caso, precisamos desenvolver uma
//        funcionalidade em particular: como cliente, queremos que o aplicativo nos permita fazer um pedido com o nome da s�rie
//        e nos envie o link de reprodu��o. O �nico limite imposto ao nosso pedido � que o n�mero de s�ries n�o pode ser superior
//        a 5 por semana. Para saber quantas j� foram vistas, ser� feito um contador. Prop�e-se a cria��o de uma estrutura de
//        classes semelhante ao exerc�cio anterior, com as seguintes classes:
//
//        Uma Interface ISerie que define um m�todo getSerie que recebe o nome, devolvendo uma String.
//
//        Uma classe Serie que implementa a interface ISerie e devolve uma String que representa o link, que simplemente � o prefixo ?www.? seguido pelo nome da s�rie.
//
//        Uma classe SerieProxy com um atributo qtdViews que conta o n�mero de vezes que uma s�rie foi solicitada e pede a Serie um link com
//        getSerie e verifica o n�mero de vezes que uma s�rie foi reproduzida e se o valor m�ximo for excedido, ela lan�a
//        uma exce��o do tipo SerieNaoHabilitadaException, criada para esse fim.
//
//        No m�todo principal (main), fa�a solicita��es de s�ries com o nome. Mostrar o link da s�rie caso esteja habilitado.
//        Se n�o estiver, exiba: "Excede o n�mero de reprodu��es permitidas". Bons estudos!

package Mesa;

public interface ISerie {

    String getSerie(String nome);

}
