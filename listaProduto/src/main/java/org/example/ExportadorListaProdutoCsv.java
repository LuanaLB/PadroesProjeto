package org.example;

public class ExportadorListaProdutoCsv extends AbstractExportadorListaProduto {
    public ExportadorListaProdutoCsv() {
        this.setSeparadorCol(",");
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
        return "";
    }

    @Override
    public String abrirLinhaTitulos() {
        return String.join(",", TITULOS_COLUNAS) + "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String criarColuna(Object valor) {
        return valor.toString();
    }
}