package com.example;

import java.util.List;
import java.util.function.Function;

public class ExportadorListaMarkdown<T> extends AbstractExportadorLista<T> {

    public ExportadorListaMarkdown(List<T> lista) {
        super(lista);
    }

    @Override
    public String abrirTabela() {
        return "|";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "\n";
    }

    @Override
    public String fecharLinha() {
        return "";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public void addNewColuna(Function<T, String> funcaoValorColuna, String titulo) {
        addColuna( new ColunaMd<>(funcaoValorColuna, titulo));
    }
}
