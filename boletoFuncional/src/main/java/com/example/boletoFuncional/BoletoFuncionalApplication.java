package com.example.boletoFuncional;

import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoletoFuncionalApplication {

	public static void main(String[] args) throws URISyntaxException {
		SpringApplication.run(BoletoFuncionalApplication.class, args);
		final var processarBoleto = new ProcessoBoleto(LeituraRetornoBradesco:: criarBoleto);

		processarBoleto.processar("bradesco-1.csv");

	}
}
