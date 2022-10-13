import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Digite o cpf do cliente: ");
		String cpf = scanner.nextLine();
		
		Cliente cliente = new Cliente(nomeCliente,cpf);
		Conta conta = new Conta();
		
		conta.setTitular(cliente);
		
		// Escolhendo as opções
		int opcao = 0;
		do {
			System.out.println("");
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Saldo ");
			System.out.println("2 - Saque ");
			System.out.println("3 - Depósito ");
			System.out.println("4 - Transferência ");
			System.out.println("5 - Rendimento ");
			System.out.println("6 - Sair ");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				conta.saldo();
				break;

			case 2:
				conta.sacar();
				break;

			case 3:
				conta.depositar();
				break;

			case 4:
				conta.transferir();
				break;

			case 5:
				conta.calcularRendimento();
				break;

			case 6:
				System.out.println("Sistema Finalizado");
				break;
			}

		} while (opcao != 6);
		
		scanner.close();
	}

}
