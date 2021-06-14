package loja;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDeDescontos;

public class ChainOfResponsabilityAndTemplateMethodTest {
	public static void main(String[] args) {
		System.out.println(new CalculadoraDeDescontos().calcular(new Orcamento(new BigDecimal("100"), 10)));
		System.out.println(new CalculadoraDeDescontos().calcular(new Orcamento(new BigDecimal("1000"), 1)));
		System.out.println(new CalculadoraDeDescontos().calcular(new Orcamento(new BigDecimal("100"), 1)));
	}
}
