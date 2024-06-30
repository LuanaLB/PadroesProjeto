package com.manoelcampos.desconto;

public class DescontoProgressivo implements  DescontoStrategy{
    @Override
    public double calcularDesconto(double valorTotal, Cliente cliente){
        double percentual = valorTotal /25;
        if (percentual > 20){
            percentual = 20;
        }
        return valorTotal * (percentual / 100);

    }
}
