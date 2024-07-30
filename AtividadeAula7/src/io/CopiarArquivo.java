package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArquivo {
    public static void main(String[] args) {
        String arquivoOrigem = "copia.txt";
        String arquivoDestino = "texto01.txt";
        
        try (FileInputStream fis = new FileInputStream(arquivoOrigem);
             FileOutputStream fos = new FileOutputStream(arquivoDestino)) {
            
            byte[] buffer = new byte[1024];
            int bytesLidos;
            while ((bytesLidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesLidos);
            }
            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
