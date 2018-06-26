package br.edu.unoesc.carrinhodecompras;

public enum TipoProduto {
	BEBIDA(new CalcularDescontoBebida()), 
	VESTUARIO(new CalcularDescontoVestuario());

	private RegraCalculo regraCalculo;

	private TipoProduto(RegraCalculo regraCalculo) {
		this.regraCalculo = regraCalculo;
	}

	public Double Calcular(Produto produto) {
		return regraCalculo.calcularDesconto(produto);
	}
}
