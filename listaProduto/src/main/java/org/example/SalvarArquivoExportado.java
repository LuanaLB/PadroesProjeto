package org.example;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SalvarArquivoExportado implements Serializable {
    private final String NOME_ARQ = "produtos.";

    public SalvarArquivoExportado(String respostaExportador, String extensao) {
        Path path = Paths.get(NOME_ARQ + extensao);
        try {
            Files.writeString(path, respostaExportador, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}