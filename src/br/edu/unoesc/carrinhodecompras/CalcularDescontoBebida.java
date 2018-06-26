package br.edu.unoesc.carrinhodecompras;

public class CalcularDescontoBebida implements RegraCalculo {

	@Override
	public Double calcularDesconto(Produto produto) {
		return (produto.getPrecoUnitario() - (produto.getPrecoUnitario() * 0.05));
	}

}
