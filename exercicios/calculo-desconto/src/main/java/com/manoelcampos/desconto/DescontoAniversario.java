package com.manoelcampos.desconto;

import java.time.LocalDate;

public class DescontoAniversario implements DescontoStrategy{
    @Override
    public double calcularDesconto(double valorTotal, Cliente cliente){
        if (cliente != null && cliente.getDataNascimento().equals(LocalDate.now())) {
          return valorTotal * 0.15;
        }
        return 0;
    }
}
