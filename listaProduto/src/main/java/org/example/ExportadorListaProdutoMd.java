package org.example;

public class ExportadorListaProdutoMd extends AbstractExportadorListaProduto {
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
    public String abrirLinhaTitulos() {     //TITULOS_COLUNAS + "\n".toString();.append("----")
        return "|" + String.join("   |  ", TITULOS_COLUNAS);
    }

    @Override
    public String fecharLinhaTitulos() {
        return "\n";
    }

    @Override
    public String criarColuna(Object valor) {
        return String.format("| %8s", valor);
    }

}