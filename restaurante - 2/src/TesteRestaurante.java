import java.util.Scanner;

public class TesteRestaurante {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		Pedido pedido = new Pedido("nomeCliente");
		
		System.out.println("Qual o nome do cliente? ");
		pedido.setNomeCliente(scanner.nextLine());
		System.out.println("");
		
		int opcao = 0;
		
		do {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Adicionar um lanche");
			System.out.println("2 - Adicionar uma bebida");
			System.out.println("3 - Adicionar taxa de serviço");
			System.out.println("4 - Fechar pedido");			
			opcao = scanner.nextInt();
			System.out.println("");
			
			switch (opcao) {
			case 1: {
				Lanche lanche = new Lanche("nomeItem", 0);
				System.out.println("Digite o nome do lanche: ");
				lanche.setNomeItem(scanner.next());
				System.out.println("Digite o preço do lanche: ");
				lanche.setPreco(scanner.nextDouble());
				System.out.println("");
				
				pedido.adicionarItem(lanche);
				break;			
			}
			case 2: {
				Bebida bebida = new Bebida("nomeItem", 0);
				System.out.println("Digite o nome da bebida: ");
				bebida.setNomeItem(scanner.next());
				System.out.println("Digite o preço da bebida: ");
				bebida.setPreco(scanner.nextDouble());
				System.out.println("");
				
				pedido.adicionarItem(bebida);
				break;			
			}
			case 3: {
				pedido.setTaxaDeServico(true);
				System.out.println("Taxa de serviço incluída");
				System.out.println("");
				break;			
			}
			case 4: {
				pedido.gerarFatura();
				System.out.println("");
				System.out.println("************************************");
				System.out.println("VALOR TOTAL: R$ " + pedido.calcularTotal());
				System.out.println("************************************");
				break;
			}
			default:
				System.out.println("Opção inválida");
			}
		}while (opcao != 4);
					
		scanner.close();		
	}
}
