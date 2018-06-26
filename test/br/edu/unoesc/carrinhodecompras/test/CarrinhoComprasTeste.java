package br.edu.unoesc.carrinhodecompras.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.unoesc.carrinhodecompras.Carrinho;
import br.edu.unoesc.carrinhodecompras.Item;
import br.edu.unoesc.carrinhodecompras.Produto;
import br.edu.unoesc.carrinhodecompras.TipoProduto;

class CarrinhoComprasTeste {

	@Test
	public void comprarProdutos() {
		Carrinho carrinho1 = new Carrinho();
		Carrinho carrinho2 = new Carrinho();		

		carrinho1.adicionarProduto(new Item(3.0, new Produto(0.22, "Pão", null)));
		carrinho1.adicionarProduto(new Item(3.0, new Produto(1.21, "Queijo", null)));
		carrinho1.adicionarProduto(new Item(3.0, new Produto(0.57, "Presunto", null)));
		carrinho1.adicionarProduto(new Item(1.0, new Produto(0.85, "Agua", TipoProduto.BEBIDA)));

		carrinho2.adicionarProduto(new Item(1.0, new Produto(100.0, "Camisa", TipoProduto.VESTUARIO)));
		
		assertEquals(Double.valueOf(6.8075), carrinho1.calcularTotalCarrinho());
		assertEquals(Double.valueOf(75.0), carrinho2.calcularTotalCarrinho());		
	}

}
