package br.edu.unoesc.carrinhodecompras;

public class CalcularDesconto {

	public Double calcularDesconto(Double preco, Double desconto) {
		return (preco - ((preco * desconto) / 100));
	}

}
