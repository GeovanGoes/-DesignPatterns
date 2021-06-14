package loja.situacao;

import java.math.BigDecimal;

import loja.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("O orcamento nao pode ser aprovado.");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("O orcamento nao pode ser reprovado.");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("O orcamento nao pode ser finalizado.");
	}
	
	public void emAnalise(Orcamento orcamento) {
		throw new DomainException("O orcamento nao pode ser colocado em análise.");
	}
	
	@Override
	public String toString() {
		return getLiteralRepresentation();
	}
	
	protected abstract String getLiteralRepresentation();
}
