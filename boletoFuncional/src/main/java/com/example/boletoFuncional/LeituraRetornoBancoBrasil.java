package com.example.boletoFuncional;

import java.time.LocalDate;
import java.util.function.Function;

public class LeituraRetornoBancoBrasil extends ProcessoBoleto {

    public LeituraRetornoBancoBrasil(Function<String, Boleto> lerRetorno) {
        super(lerRetorno);
        //TODO Auto-generated constructor stub
    }

    public static Boleto criarBoleto(String linha) {

        String[] vetor = linha.split(";");
        var boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);

        boleto.setDataVencimento(LocalDate.parse(vetor[2], ProcessoBoleto.FORMATO_DATA));
        boleto.setDataPagamento(LocalDate.parse(vetor[3], ProcessoBoleto.FORMATO_DATA).atTime(0, 0, 0));
        boleto.setCpfCliente(vetor[4]);
        boleto.setValor(Double.parseDouble(vetor[5]));
        boleto.setMulta(Double.parseDouble(vetor[6]));
        boleto.setJuros(Double.parseDouble(vetor[7]));

        return boleto;
    }

}
