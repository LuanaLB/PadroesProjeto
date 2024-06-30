package com.manoelcampos.desconto;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria", LocalDate.of(1990, Month.JUNE, 17));

        double valorTotal = 1000;

        DescontoStrategy descontoFixo = new DescontoFixo(10);
        Venda vendaComDescontoFixo = new Venda(valorTotal, descontoFixo, cliente);
        System.out.println("Total com desconto fixo: " + vendaComDescontoFixo.calcularTotalComDesconto());

        DescontoStrategy descontoProgressivo = new DescontoProgressivo();
        Venda vendaComDescontoProgressivo = new Venda(valorTotal, descontoProgressivo, cliente);
        System.out.println("Total com desconto progressivo: " + vendaComDescontoProgressivo.calcularTotalComDesconto());

        DescontoStrategy descontoAniversario = new DescontoAniversario();
        Venda vendaComDescontoAniversario = new Venda(valorTotal, descontoAniversario, cliente);
        System.out.println("Total com desconto de aniversário: " + vendaComDescontoAniversario.calcularTotalComDesconto());
    }
}
