package br.edu.unoesc.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Item> item;
	
	public void adicionarProduto(Item item) {
		if (this.item == null) {
			this.item = new ArrayList<>();
		}
		this.item.add(item);
	}
	
	public void removerProduto(Item item) {
		if (this.item != null) {
			this.item.remove(item);
		}
	}	
	
	public Double calcularTotalCarrinho() {
		Double valor = 0.0;
		for (Item item2 : this.item) {
			valor += item2.calcularPrecoTotal();
		}
		return valor;
	}
}
