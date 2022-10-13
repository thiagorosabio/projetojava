
//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

import java.util.Scanner;

public class sucessor {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" digite um numero");
		
		int valor = leia.nextInt();
		
		int atecessor = valor -1;
		int sucessor = valor +1;
		
		System.out.println(" O sucessor é "+ sucessor + " Atecessor é " + atecessor );
		
		
		
		
		
		
		
	}

}
