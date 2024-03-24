package com.example.boletoFuncional;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

import lombok.Setter;

@Setter
public  class ProcessoBoleto {

    public static final DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Function<String, Boleto> lerRetorno;

    public ProcessoBoleto(Function<String, Boleto> lerRetorno) {
        this.lerRetorno = lerRetorno;
    }

    public final void processar(String nomeArquivo) {
        System.out.println("Boleto");

        try {
            var boletos = Files.lines(Paths.get(nomeArquivo)).map(this.lerRetorno).toList();
            boletos.forEach(System.out::println);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
