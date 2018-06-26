package br.edu.unoesc.carrinhodecompras;

public class CalcularDescontoVestuario implements RegraCalculo {

	@Override
	public Double calcularDesconto(Produto produto) {
		return (produto.getPrecoUnitario() - (produto.getPrecoUnitario() * 0.25));
	}

}
