package br.edu.unoesc.carrinhodecompras;

public class CalcularDescontoVestuario extends CalcularDesconto implements RegraCalculo {

	@Override
	public Double calcularDesconto(Produto produto) {
		return super.calcularDesconto(produto.getPrecoUnitario(), 25.0);
	}

}
