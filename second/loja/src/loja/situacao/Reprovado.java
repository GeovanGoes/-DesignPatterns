package loja.situacao;

import loja.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

	@Override
	protected String getLiteralRepresentation() {
		return "REPROVADO";
	}
}
