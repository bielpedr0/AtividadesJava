package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArray {
    public static void main(String[] args) {
        String[] linhas = {
            "Linha 1",
            "Linha 2",
            "Linha 3",
            "Linha 4"
        };
        
        String nomeArquivo = "texto03.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
            System.out.println("Array de strings gravado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
