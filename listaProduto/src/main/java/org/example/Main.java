package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(new Produto(1, "TV", "LG", "1500,00", 70),
                new Produto(2, "Tablet", "Samsung", "900,00", 50),
                new Produto(3, "PC", "Dell", "5000,00", 12),
                new Produto(4, "TV", "Samsung", "2000,00", 20),
                new Produto(5, "Mac", "Apple", "14000,00", 3));

        final String extensao = "html";
        String respostaExportador = ExportadorListaProduto.newInstace(extensao).exportar(produtos);
        salvar(respostaExportador, extensao);
    }

    private static void salvar(String respostaExportador, String extensao) {
        new SalvarArquivoExportado(respostaExportador, extensao);
    }
}