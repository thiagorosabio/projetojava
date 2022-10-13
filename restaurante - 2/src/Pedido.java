import java.util.ArrayList;

public class Pedido {

	private String nomeCliente;
	private ArrayList<Item> itensConsumidos = new ArrayList<Item>();
	private boolean taxaDeServico = false;

	public Pedido(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void gerarFatura() {
		System.out.println("********** RESTAURANTE CI&T ********");
		System.out.println("");
		System.out.println("           Cliente: " + this.nomeCliente);
		System.out.println("");
		System.out.println("*************** ITENS **************");
		System.out.println("");
		for (Item itemConsumido : itensConsumidos) {
			System.out.println(itemConsumido.getNomeItem() + " = R$ " + itemConsumido.getPreco());
		}

	}

	public double calcularTotal() {

		double total = 0;
		double taxa = 0; 

		for (Item itemConsumido : itensConsumidos) {
			total += itemConsumido.getPreco();
		}
		
		if (taxaDeServico) {
			taxa = total * 0.15; 
			total *= 1.15;			
			System.out.println("TAXA DE SERVIÇO: R$ " + taxa);
			
		}else  {
			System.out.println("TAXA DE SERVIÇO: R$ " + taxa);
		}
		return total;
				
	}

	public void adicionarItem(Item item) {
		this.itensConsumidos.add(item);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Item> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(ArrayList<Item> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public boolean isTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(boolean taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}
}