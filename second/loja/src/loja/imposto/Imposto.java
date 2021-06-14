package loja.imposto;

import java.math.BigDecimal;

import loja.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
