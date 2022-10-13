import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("informe seu nome");
		String nome = leitor.nextLine();

		System.out.println("informe seu salario");
		float salario = leitor.nextFloat();

		System.out.println("O funcionario " + nome + " tem o salario de R$ "
		+ salario + " no mes de junho");

		leitor.close();

	}

}

//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório

//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13

//Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.

//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.