package loja;

import java.math.BigDecimal;

public class StateTest {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 10);
		System.out.println(orcamento);
		orcamento.aplicarDescontoExtra();
		System.out.println(orcamento);
		orcamento.aprovar();
		System.out.println(orcamento);
		orcamento.aplicarDescontoExtra();
		System.out.println(orcamento);
		orcamento.finalizar();
		System.out.println(orcamento);
		orcamento.aplicarDescontoExtra();
		System.out.println(orcamento);
	}
	
	
}
