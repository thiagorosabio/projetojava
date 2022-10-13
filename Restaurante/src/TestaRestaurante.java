import java.util.Scanner;

public class TestaRestaurante {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = leitor.nextLine();
		System.out.println("Quer dar a taxa de serviço ?");
		
		System.out.println("Qual seu pedido?");
		String lanche = leitor.nextLine();
		System.out.println("Qual seu preço?");
		
		double preco = leitor.nextDouble();
		Pedido meuPedido = new Pedido(nome);
		meuPedido.setTaxaDeServico(true);
		Lanche meuLanche = new Lanche();
		meuLanche.setNome(lanche);
		meuLanche.setPreco(preco);
		Bebidas minhaBebida = new Bebidas();
		minhaBebida.setNome("coca");
		minhaBebida.setPreco(77);
		meuPedido.getConsumidos().add(minhaBebida);
		meuPedido.getConsumidos().add(meuLanche);
		double total = meuPedido.calculatotal();

		System.out.println("O valor do pedido é " + total);

		System.out.println("qual seu pedido");

	}
}
