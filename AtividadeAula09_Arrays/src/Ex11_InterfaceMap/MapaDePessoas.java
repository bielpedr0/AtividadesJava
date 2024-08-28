package Ex11_InterfaceMap;

import java.util.HashMap;
import java.util.Map;

public class MapaDePessoas {
    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Gabriel", 30);
        pessoas.put("Tiago", 25);
        pessoas.put("Gustavo", 20);

        System.out.println("Idade de Gabriel: " + pessoas.get("Gabriel"));
    }
}