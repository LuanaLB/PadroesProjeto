package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> listProdutos = List.of(
                new Produto("1", "SmartTv", "LG"),
                new Produto("2", "TV Best", "Samsung"),
                new Produto("3", "TV Big", "Apple")
        );

        var exportadorHtml = ExportadorLista.newInstance(listProdutos, "html");
        exportadorHtml.addNewColuna(Produto::getNome, "Nome");
        exportadorHtml.addNewColuna(Produto::getMarca, "Marca");

        /*var exportadorCsv = ExportadorLista.newInstance(listProdutos, "csv");
        exportadorCsv.addNewColuna(Produto::getNome, "Nome");
        exportadorCsv.addNewColuna(Produto::getMarca, "Marca");*/

        var exportadorMd = (ExportadorListaMarkdown<Produto>)ExportadorLista.newInstance(listProdutos, "md");
        exportadorMd.addColuna(new ColunaHtml<>("Id", Produto::getId));
        exportadorMd.addNewColuna(Produto::getNome, "Nome");
        exportadorMd.addNewColuna(Produto::getMarca, "Marca");

        String resultado2 = exportadorHtml.exportar();
        System.out.println(resultado2);
    }
}
