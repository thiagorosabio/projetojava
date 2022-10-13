package Ecercicio1;

import java.util.Scanner;

	public class TestaFibonacci {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Insira um número para ver a série Fibonacci: ");
			int num = scanner.nextInt();

			System.out.println("Série Fibonacci de " + num);
			
			for (int i = 0; i < num; i++) {

				System.out.print(Fibonacci.calcularFibonacci(i) + " ");
			}
			scanner.close();
		}

	}



