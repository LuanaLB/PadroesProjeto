package com.example.demo;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * LeituraRetorno
 */
public interface LeituraRetorno {

    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    List<Boleto> lerArquivo(String nomeArquivo);
}