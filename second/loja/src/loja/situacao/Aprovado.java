package loja.situacao;

import java.math.BigDecimal;

import loja.Orcamento;

public class Aprovado extends SituacaoOrcamento {
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

	@Override
	protected String getLiteralRepresentation() {
		return "APROVADO";
	}
}
