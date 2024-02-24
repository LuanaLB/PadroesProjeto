package com.example.demo;

import lombok.Data;
import lombok.Setter;

@Setter
public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo) {
        //var lista = leituraRetorno.lerArquivo("banco-brasil-1.csv");
        var lista = leituraRetorno.lerArquivo(("bradesco-1.csv"));
        System.out.println(lista);
    }
}
