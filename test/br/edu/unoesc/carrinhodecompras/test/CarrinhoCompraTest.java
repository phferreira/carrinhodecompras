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
		Produto pao = new Produto();
		Produto queijo = new Produto();
		Produto presunto = new Produto();
		Produto agua = new Produto();

		pao.setDescricao("Pão");
		queijo.setDescricao("Queijo");
		presunto.setDescricao("Presunto");
		agua.setDescricao("Água");

		pao.setPrecoUnitario(0.22);
		queijo.setPrecoUnitario(1.21);
		presunto.setPrecoUnitario(0.57);
		agua.setPrecoUnitario(1.0);

		agua.setTipoProduto(TipoProduto.BEBIDA);

		Carrinho carrinho = new Carrinho();

		Item item1 = new Item(3.0, pao);
		Item item2 = new Item(3.0, queijo);
		Item item3 = new Item(3.0, presunto);
		Item item4 = new Item(1.0, agua);

		carrinho.adicionarProduto(item1);
		carrinho.adicionarProduto(item2);
		carrinho.adicionarProduto(item3);
		carrinho.adicionarProduto(item4);

		assertEquals(Double.valueOf(6.0), carrinho.calcularTotalCarrinho());
	}

}
