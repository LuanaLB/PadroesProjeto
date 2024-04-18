package com.example;

import java.util.function.Function;

public class ColunaCsv<T> extends AbstractColuna<T> {

    public ColunaCsv(String titulo, Function<T, String> funcaoValorColuna) {
        super(titulo, funcaoValorColuna);
    }

    @Override
    public String abrir() {
        return ",";
    }

    @Override
    public String fechar() {
        return "";
    }
}
