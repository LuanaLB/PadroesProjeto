package com.example;

import java.util.List;
import java.util.function.Function;

public class ExportadorListaCsv<T> extends AbstractExportadorLista<T> {

    public ExportadorListaCsv(List<T> lista) {
        super(lista);
    }

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {return ",";}

    @Override
    public void addNewColuna(Function<T, String> funcaoValorColuna, String titulo) {
       addColuna(new ColunaHtml<T>(titulo, funcaoValorColuna));
    }
}
