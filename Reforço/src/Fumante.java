import java.util.Scanner;

//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.





public class Fumante {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantidade de Cigarros Fumados dias");
		int qtdCigarro = leia.nextInt();
		
		System.out.println(" Quantos anos Fumados");
		int anosFumados = leia.nextInt();
		
		int qtdMinutosPerdidos = qtdCigarro*10, TotaldiasFumados = anosFumados* 365, 
				TotalMinutosFumados = TotaldiasFumados*3600;
		
		float qtdMinutosRestantes = (TotalMinutosFumados  - qtdMinutosPerdidos) /3600;
		
		System.out.println(" Seu tempo de vida é " + qtdMinutosRestantes);
		
		
		
								
		
		
		
		
		
		
		

	}

}
