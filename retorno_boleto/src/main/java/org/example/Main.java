package org.example;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        ProcessarBoletos processarBoletos = new ProcessarBoletos(LeituraBradesco::lerArquivo);
        URI caminhoArquivo = Objects.requireNonNull(Main.class.getResource("bradesco-1.csv")).toURI(); //bradesco-1.csv banco-brasil-1.csv
        System.out.println("Lendo o arquivo -> " + caminhoArquivo + " <-\n");
        processarBoletos.processar(caminhoArquivo);
    }
}