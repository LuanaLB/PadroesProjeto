package org.example;

public class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto {
    @Override
    public String abrirTabela() { // border="1">
        return "<table>\n";
    }

    @Override
    public String abrirLinha() {
        return "\n<tr>\n";
    }

    @Override
    public String criarColuna(Object valor) {
        return "<td>" + valor + " </td>";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<th>" + String.join("<th>", TITULOS_COLUNAS);
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</th>\n";
    }

    @Override
    public String fecharLinha() {
        return "</tr>";
    }

    @Override
    public String fecharTabela() {
        return "</table>\n";
    }
}