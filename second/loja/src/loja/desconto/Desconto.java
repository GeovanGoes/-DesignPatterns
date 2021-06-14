package loja.desconto;

import java.math.BigDecimal;

import loja.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento))
			return efetuarCalculo(orcamento);
		else 
			return this.proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
