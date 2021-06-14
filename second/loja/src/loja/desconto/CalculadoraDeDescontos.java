package loja.desconto;

import java.math.BigDecimal;

import loja.Orcamento;

public class CalculadoraDeDescontos {
	
	//Chains of responsibility com Template Method
	public BigDecimal calcular(Orcamento orcamento) {
		DescontoParaOrcamentoComValorMaiorQueQuinhentos maiorQuinentos = new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto());
		DescontoParaOrcamentoComMaisDeCincoItens cinco = new DescontoParaOrcamentoComMaisDeCincoItens(maiorQuinentos);
		return cinco.calcular(orcamento);
	}
}
