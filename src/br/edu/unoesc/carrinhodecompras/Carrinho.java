package br.edu.unoesc.carrinhodecompras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
	private Map<Integer, Item> item;

	public void adicionarProduto(Item item) {
		if (this.item == null) {
			this.item = new HashMap<>();
		}
		this.item.put(item.getProduto().getCodigoProduto(), item);
	}

	public void removerProduto(Item item1) {
		if (this.item != null) {
			this.item.remove(1);
		}
	}

	public Double calcularTotalCarrinho() {
		Double valor = 0.0;
		for (Item item2 : this.item.values()) {
			valor += item2.calcularPrecoTotal();
		}
		return valor;
	}

	public Map<Integer, Item> getItem() {
		return item;
	}

}
