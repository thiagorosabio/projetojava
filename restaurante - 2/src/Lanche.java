
public class Lanche extends Item {
	
	private int peso;	
	private String ingredientes;
	
	public Lanche(String nomeItem, double preco) {
		super(nomeItem, preco);		
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}
