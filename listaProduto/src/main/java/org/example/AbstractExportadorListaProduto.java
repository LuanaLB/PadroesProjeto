package org.example;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {
    /**
     *
     */
    protected final List<String> TITULOS_COLUNAS = List.of("CÓDIGO", "NOME", "MARCA", "VALOR", "ESTOQUE");

    @Getter @Setter(AccessLevel.PROTECTED)
    private String separadorCol = "";

    @Override
    public final String exportar(List<Produto> Listaproduto) {
        return new StringBuilder(abrirTabela())
                .append(abrirLinhaTitulos())
                .append(fecharLinhaTitulos())
                .append(gerarLinhaProduto(Listaproduto))
                .append(fecharTabela()).toString();
    }

    protected String gerarLinhaProduto(List<Produto> listaproduto) {
        return listaproduto
                .stream()
                .map(this::gerarColunasProduto)
                .collect(Collectors.joining());
    }

    protected String gerarColunasProduto(Produto produto) {
        var colunas = List.of(
                criarColuna(produto.getId()),
                criarColuna(produto.getNomeProduto()),
                criarColuna(produto.getMarcaProduto()),
                criarColuna(produto.getValorProduto()),
                criarColuna(produto.getEstoqueProtduto())
        );

        return colunas.stream().collect(Collectors.joining(getSeparadorCol())) + "\n";
    }
}