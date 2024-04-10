package org.example;

import java.util.List;

public interface ExportadorListaProduto {
    static ExportadorListaProduto newInstace() {
        return newInstace("html");
    }

    static ExportadorListaProduto newInstace(String extensao) {
        return switch (extensao.toLowerCase()){
            case "html" -> new ExportadorListaProdutoHtml();
            case "md" -> new ExportadorListaProdutoMd();
            case "csv" -> new ExportadorListaProdutoCsv();
            default -> throw new UnsupportedOperationException(
                    "Formato de exportação não suportado: " + extensao);
        };
    }

    public String abrirTabela();

    public String fecharTabela();

    public String abrirLinha();

    public String fecharLinha();

    public String abrirLinhaTitulos();

    public String fecharLinhaTitulos();

    public String criarColuna(Object valor);

    public String exportar(List<Produto> produto);
}