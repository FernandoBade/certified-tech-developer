package Mesa;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, Arvore> arvoreFlyweight = new HashMap<>();
    public Arvore getArvore(String nome, int altura, int largura, String cor){
        String arvore = "registrado como: " + nome;
        System.out.println(arvore);

        if (arvoreFlyweight.containsKey(arvore)){
            System.out.println("especie já registrada");
            return  arvoreFlyweight.get(arvore);
        }
        arvoreFlyweight.put(arvore, new Arvore(nome, altura, largura, cor));
        System.out.println("especie registrada com sucesso");
        return  arvoreFlyweight.get(arvore);
    }
}
