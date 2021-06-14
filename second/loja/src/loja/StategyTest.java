package loja;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;

public class StategyTest {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 10);
		BigDecimal iss = new CalculadoraDeImpostos().calcular(orcamento, new ISS());
		BigDecimal icms = new CalculadoraDeImpostos().calcular(orcamento, new ICMS());
		System.out.println(iss);
		System.out.println(icms);
	}
}
