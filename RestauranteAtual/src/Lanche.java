
public class Lanche extends Item {
	private double peso;
	private String ingredientes;

	public Lanche(String nomeItem, double preco, double peso, String ingredientes) {
		super(preco, nomeItem);
		this.peso = peso;
		this.ingredientes = ingredientes;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
}
