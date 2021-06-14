package loja;

import java.math.BigDecimal;

import loja.situacao.EmAnalise;
import loja.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private Integer quantidadeDeItens;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
		super();
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new EmAnalise();
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public Integer getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	public void aplicarDescontoExtra() {
		this.valor = valor.subtract(situacao.calcularDescontoExtra(this));
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	@Override
	public String toString() {
		return "Orcamento [valor=" + valor + ", quantidadeDeItens=" + quantidadeDeItens + ", situacao=" + situacao
				+ "]";
	}
}
