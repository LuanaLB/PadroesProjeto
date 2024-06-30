package com.manoelcampos.desconto;

interface DescontoStrategy {
    double calcularDesconto(double valorTotal, Cliente cliente);
}
