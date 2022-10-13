import java.util.ArrayList;

public class Pedido {

	private String cliente;
	private ArrayList<Item> consumidos = new ArrayList<Item>();
	private boolean taxaDeServico;

	public Pedido(String nomecliente) {
		cliente = nomecliente;
		taxaDeServico = true;
		
	}

	public void gerarfatura() {
		System.out.println("cliente: " + cliente);

		for (Item comida : consumidos) {
			System.out.println(comida.getNome() + " " + comida.getPreco());

		}

		System.out.println("calcula total: " + calculatotal());

	}

	private double calculatotal() {
		double total = 0;

		// Dois metodos de usar o for
		// for (int indice = 0; indice < consumidos.size(); indice+=1 )
		for (Item comida : consumidos) {
			total += comida.getPreco();

		}
		
		
		if(this.isTaxadeservico()) {
			total = total*1.15;
		}
		return total;
	}

	public boolean isTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(boolean taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public ArrayList<Item> getConsumidos() {
		return consumidos;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public boolean isTaxadeservico() {
		return taxaDeServico;
	}

	public void setTaxadeservico(boolean taxadeservico) {
		this.taxaDeServico = taxadeservico;
	}

	public void setgerafatura(boolean gerafatura) {
		this.taxaDeServico = gerafatura;
	}
}
