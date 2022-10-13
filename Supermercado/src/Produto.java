
public  class Produto {
	
	private String nomeProtudo;
	private double precoProduto;
	private int quantidadeEstoque;
	
	public Produto(String nomeProduto, double precoProduto, int quantidadeEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeEstoque = quantidadeEstoque;
		
		
	}

	public String getNomeProtudo() {
		return nomeProtudo;
	}

	public void setNomeProtudo(String nomeProtudo) {
		this.nomeProtudo = nomeProtudo;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	

}
