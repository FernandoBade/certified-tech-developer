import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static final Map<String, Computer> macFlyweight = new HashMap<>();

    public Computer getComputer(int ram, int hd) {
        String id = "id: " + ram + " # " + hd;
        System.out.println(id);

        if(!macFlyweight.containsKey(id)) {
            macFlyweight.put(id, new Computer(ram, hd));
            System.out.println("Computador criado com sucesso!");
            return macFlyweight.get(id);
        }
        System.out.println("\nComputador já existe!");
        return macFlyweight.get(id);
    }


}
