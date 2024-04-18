package com.example;

import java.util.List;
import java.util.function.Function;

public interface ExportadorLista<T> {

    String abrirTabela();

    String fecharTabela();

    String abrirLinha();

    String fecharLinha();

    String abrirLinhaTitulos();

    String fecharLinhaTitulos();

    String exportar();


    void addNewColuna(Function<T, String> funcaoValorColuna, String titulo);

    static <T> ExportadorLista<T> newInstance(List<T> lista, String extensao) {
        return switch (extensao.toLowerCase()) {
            case "html" -> new ExportadorListaHtml(lista);
            case "md" -> new ExportadorListaMarkdown(lista);
            case "csv" -> new ExportadorListaCsv(lista);
            default -> throw new IllegalArgumentException("Formato não suportado: " + extensao);
        };
    }
    static <T> ExportadorLista newInstance(List<T> lista) {
        return newInstance(lista, "html");
    }
}

