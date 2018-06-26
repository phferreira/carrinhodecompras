package br.edu.unoesc.carrinhodecompras;

public class Produto {
	private Double precoUnitario;
	private String descricao;
	private TipoProduto tipoProduto;

	public Produto(Double precoUnitario, String descricao, TipoProduto tipoProduto) {
		super();
		this.precoUnitario = precoUnitario;
		this.descricao = descricao;
		this.tipoProduto = tipoProduto;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double calularPreco() {
		if (this.tipoProduto != null) {
			return tipoProduto.Calcular(this);
		} else {
			return getPrecoUnitario();
		}
	}
}
