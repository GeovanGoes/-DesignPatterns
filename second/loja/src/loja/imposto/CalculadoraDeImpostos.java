package loja.imposto;

import java.math.BigDecimal;

import loja.Orcamento;

public class CalculadoraDeImpostos {

	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
