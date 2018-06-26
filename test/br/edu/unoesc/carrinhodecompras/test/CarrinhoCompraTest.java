package br.edu.unoesc.carrinhodecompras.test;

import br.edu.unoesc.carrinhodecompras.Carrinho;
import br.edu.unoesc.carrinhodecompras.Item;
import br.edu.unoesc.carrinhodecompras.Produto;
import br.edu.unoesc.carrinhodecompras.TipoProduto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarrinhoCompraTest {

	@Test
	public void comprarProdutos() {
		Produto pao = new Produto(0.22, "Pão", null);
		Produto queijo = new Produto(1.21, "Queijo", null);
		Produto presunto = new Produto(0.57, "Presunto", null);
		Produto agua = new Produto(0.85, "Agua", TipoProduto.BEBIDA);
		Produto camisa = new Produto(100.0, "Camisa", TipoProduto.VESTUARIO);

		Carrinho carrinho1 = new Carrinho();
		Carrinho carrinho2 = new Carrinho();		

		carrinho1.adicionarProduto(new Item(3.0, pao));
		carrinho1.adicionarProduto(new Item(3.0, queijo));
		carrinho1.adicionarProduto(new Item(3.0, presunto));
		carrinho1.adicionarProduto(new Item(1.0, agua));

		carrinho2.adicionarProduto(new Item(1.0, camisa));
		
		assertEquals(Double.valueOf(6.8075), carrinho1.calcularTotalCarrinho());
		assertEquals(Double.valueOf(75.0), carrinho2.calcularTotalCarrinho());		
	}

}
