package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Venda {
    private long id;
    private Cliente cliente;
    private LocalDate data;
    private double valorTotal;
    private DescontoStrategy descontoStrategy;

    public Venda(double valorTotal, DescontoStrategy descontoFixo, Cliente cliente) {}

    public Venda(Cliente cliente, LocalDate data, DescontoStrategy descontoStrategy, double valorTotal) {
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotalComDesconto(){
        double desconto = descontoStrategy.calcularDesconto(valorTotal, cliente);
        return valorTotal - desconto;
    }
}
