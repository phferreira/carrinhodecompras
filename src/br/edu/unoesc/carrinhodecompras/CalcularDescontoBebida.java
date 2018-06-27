package br.edu.unoesc.carrinhodecompras;

public class CalcularDescontoBebida extends CalcularDesconto implements RegraCalculo {

	@Override
	public Double calcularDesconto(Produto produto) {
		return super.calcularDesconto(produto.getPrecoUnitario(), 5.0);
	}

}
