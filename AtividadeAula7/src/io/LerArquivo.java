package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "texto01";
        
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

