package br.edu.unoesc.carrinhodecompras;

public class Item  implements Comparable<Item>{
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
	
	public String exibirProduto() {
		return this.produto.getDescricao() + "|" +
			   String.valueOf(this.produto.getPrecoUnitario()) + "|" +
			   String.valueOf(this.quantidade) + "|" +
			   String.valueOf(this.produto.calularPreco() + "|" +
			   String.valueOf(calcularPrecoTotal()));
				
	}

	@Override
	public int compareTo(Item item) {
		return Double.compare(this.produto.getPrecoUnitario(), item.produto.getPrecoUnitario());
	}
}
