import java.util.Scanner;

public class TestaBanco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===================");
		System.out.println("    BEM VINDO(A)   ");
		System.out.println("===================");

		System.out.println("Qual o sua agência?");
		double agencia = scanner.nextDouble();

		System.out.println("Qual o número da conta?");
		double numeroConta = scanner.nextDouble();

		System.out.println("Qual o seu nome?");
		String cliente = scanner.next();

		System.out.println("Qual o seu cpf?\n");
		String cpf = scanner.next();

		System.out.println("Qual o tipo de sua conta?");
		System.out.println("1-Conta Corrente");
		System.out.println("2-Conta Poupança");
		int tipoconta = scanner.nextInt();

		switch (tipoconta) {
		case 1:
			ContaCorrente cc = new ContaCorrente(agencia, numeroConta, cliente, cpf);
			System.out.println("Sua conta corrente foi criada com sucesso!");

			int opcao = 0;

			do {

				System.out.println("O que você gostaria de fazer?");
				System.out.println("1-Sacar");
				System.out.println("2 Depositar");
				System.out.println("3-Ver saldo da conta");
				System.out.println("4-Sair");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:

					cc.FazerSaque();

					break;

				case 2:

					System.out.println("Quanto você gostaria de depositar?");
					double quantiaDepositar = scanner.nextDouble();
					cc.FazerDeposito(quantiaDepositar);
					break;

				case 3:
					cc.saldo();

					break;

				case 4:
					System.out.println("Programa encerrado com sucesso");
					break;

				default:
					System.out.println("Opção inválida! Tente novamente! ");
				}

			} while (opcao != 4);

		case 2:

			ContaPoupanca pp = new ContaPoupanca(agencia, numeroConta, cliente, cpf);
			System.out.println("Sua conta poupança foi criada com sucesso!");

			do {

				System.out.println("O que você gostaria de fazer?");
				System.out.println("1-Sacar");
				System.out.println("2 Depositar");
				System.out.println("3-Ver saldo da conta");
				System.out.println("4-Ver rendimento da conta");
				System.out.println("5-Sair");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:

					pp.FazerSaque();
					break;

				case 2:
					System.out.println("Quanto você gostaria de depositar?");
					Double quantiaDepositar = scanner.nextDouble();
					pp.FazerDeposito(quantiaDepositar);
					break;

				case 3:
					pp.saldo();
					break;

				case 4:
					
					System.out.println("O rendimento da sua conta foi de R$ " 
				  + pp.CalcularRendimento());
					
					
					System.out.println("Saldo + rendimento = R$ "+ 
					(pp.CalcularRendimento()+ pp.saldo()));
					break;

				case 5:
					System.out.println("Programa encerrado com sucesso");
					break;

				default:
					System.out.println("Opção inválida! Tente novamente! ");
				}

			} while (opcao != 5);

			scanner.close();
		}
	}
}
