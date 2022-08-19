package Aula08_Facade;

public class ApiQuantidade {

    public int desconto(int quantidade){
        if(quantidade>11){
            return 15;
        }else{
            return 0;
        }
    }
}