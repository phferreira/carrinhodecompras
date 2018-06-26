package br.edu.unoesc.carrinhodecompras;

public class Item {
	private Double quantidade;
	private Produto produto;

	public Item(Double quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double calcularPrecoTotal() {
		return (produto.calularPreco() * quantidade);
	}
}
