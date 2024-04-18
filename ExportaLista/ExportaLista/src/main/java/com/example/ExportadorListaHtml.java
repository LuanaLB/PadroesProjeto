package com.example;

import java.util.List;
import java.util.function.Function;

public class ExportadorListaHtml<T> extends AbstractExportadorLista<T> {

    public ExportadorListaHtml(List<T> lista) {
        super(lista);
    }

    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<thead>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</thead>\n";
    }

    @Override
    public void addNewColuna(Function<T, String> funcaoValorColuna, String titulo) {
       addColuna(new ColunaHtml<T>(titulo, funcaoValorColuna));
    }
}
