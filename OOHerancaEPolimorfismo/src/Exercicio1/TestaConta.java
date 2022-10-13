//Crie uma classe Teste que contenha a seguinte lógica:
//• Criar contas
//• Sacar um valor das contas
//• Depositar
//• Mostrar um novo saldo a partir de um rendimento
//• Mostrar os dados da conta do cliente

package Exercicio1;

import java.util.Scanner;

public class TestaConta {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		System.out.println("-------------------");
		System.out.println("---BANCO ORIENTA---");
		System.out.println("-------------------");

		do {

			System.out.println();

			System.out.println("Escolha uma das operações abaixo:");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Saldo da conta Rendimento");
			System.out.println("5 - Dados da conta");
			System.out.println("6 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:
				System.out.println("Acesso a conta finalizado com sucesso");

				break;

			default:
				System.out.println("Opção inválida, tente novamente");

				break;
			}
		} while (opcao != 7);

		leia.close();
	}

}
