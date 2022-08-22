package Aula09_Integradora03.Mesa;

import java.util.HashMap;

public class FlyweightFactory {
    public static final HashMap<String, Roupa> tamanhos = new HashMap<>();
    public static final HashMap<String, Roupa> tipoMap = new HashMap<>();
    public static final HashMap<Boolean, Roupa> ehNovoMap = new HashMap<Boolean, Roupa>();
    public static final HashMap<Boolean, Roupa> ehImportadaMap = new HashMap<Boolean, Roupa>();


    public static Roupa inserirRoupa(String tamanho, String tipo, boolean ehNovo, boolean ehImportada){
        Roupa roupa = new Roupa(tamanho, tipo, ehNovo, ehImportada);

        Roupa roupa1 = tamanhos.get(roupa.getTamanho());

        if(roupa1 == null){
            tamanhos.put(tamanho, roupa1);
        }

        Roupa roupa2 = ehImportadaMap.get(roupa.isEhImportada());

        if (roupa2 == null){
            ehImportadaMap.put(ehImportada, roupa2);
        }

        Roupa roupa3 = ehNovoMap.get(roupa.isEhNovo());

        if (roupa3 == null){
            ehNovoMap.put(ehNovo, roupa3);
        }

        Roupa roupa4 = tipoMap.get(roupa.getTipo());
        if (roupa4 == null){
            tipoMap.put(tipo, roupa4);
        }

        return roupa;
    }
}
