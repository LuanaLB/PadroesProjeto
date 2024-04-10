package org.example;

import lombok.Data;

@Data
public class Produto {
    private int id;
    private String nomeProduto;
    private String marcaProduto;
    private String valorProduto;
    private int estoqueProtduto;

    public Produto(int id, String tv, String lg, String valor, int estoque) {
        this.id = id;
        this.nomeProduto = tv;
        this.marcaProduto = lg;
        this.valorProduto = valor;
        this.estoqueProtduto = estoque;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id: ").append(id);
        sb.append(", nome: '").append(nomeProduto).append('\'');
        sb.append(", marca: '").append(marcaProduto).append('\'');
        sb.append(", valor: '").append(valorProduto).append('\'');
        sb.append(", estoque: ").append(estoqueProtduto);
        sb.append('}');
        return sb.toString();
    }
}