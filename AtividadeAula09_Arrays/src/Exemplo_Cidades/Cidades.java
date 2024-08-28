package Exemplo_Cidades;

import java.util.ArrayList;

public class Cidades {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("Campinas");
        cidades.add("Vinhedo");
        cidades.add("Paulínia");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
