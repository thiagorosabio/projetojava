import java.util.Scanner;

public class e96 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();
		
		double nota1 = lerNota(teclado);
		
		double nota2 = lerNota(teclado);
		
		double notaFinalAritmetica = mediaAritmetica(nota1, nota2);
		double notaFinalPonderada = mediaPonderada(nota1, nota2);
		
		System.out.println("A sua media aritmetica  " + notaFinalAritmetica);
		System.out.println("A sua media ponderada " + notaFinalPonderada);
		
		teclado.close();
	}
	
	public static double mediaAritmetica(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		return media;
	}
	
	public static double mediaPonderada(double nota1, double nota2) {
		double media = ((nota1 * 2) + (nota2 * 3)) / (2 + 3);
		return media;
	}
	
	public static double lerNota(Scanner teclado) {		
		System.out.println("Insira uma nota");
		double nota = teclado.nextDouble();
		
		return nota;
	}

}