package com.example.boletoFuncional;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LeituraRetornoBradesco   {

    public static Boleto criarBoleto(String linha) {
        String[] vetor = linha.split(";");
        var boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setAgencia(vetor[2]);
        boleto.setContaBancaria(vetor[3]);

        boleto.setDataVencimento(LocalDate.parse(vetor[4], ProcessoBoleto.FORMATO_DATA));
        boleto.setDataPagamento(LocalDateTime.parse(vetor[5], ProcessoBoleto.FORMATO_DATA_HORA));

        boleto.setCpfCliente(vetor[6]);
        boleto.setValor(Double.parseDouble(vetor[7]));
        boleto.setMulta(Double.parseDouble(vetor[8]));
        boleto.setJuros(Double.parseDouble(vetor[9]));

        return boleto;
    }

}
