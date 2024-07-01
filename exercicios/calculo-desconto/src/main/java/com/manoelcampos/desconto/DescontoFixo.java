package com.manoelcampos.desconto;

public class DescontoFixo implements DescontoStrategy{
    private double percentual;

    public  DescontoFixo(double percentual) {this.percentual = percentual;}

    @Override
    public double calcularDesconto(double valorTotal, Cliente cliente) {
        return valorTotal * (percentual / 100);
    }
}
