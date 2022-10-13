import java.util.Scanner;
import java.lang.Math;
public class e16 {
	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("QTDE de cigarros fumados por dia");
		int cigarrodias = leia.nextInt();
		System.out.println("Quantos anos voce fuma? ");
		int tempovida = leia.nextInt();
		double Qtdcigarrofumado = tempovida*365*cigarrodias;
		double tempoperdido = 10* Qtdcigarrofumado;
		double tempototal = tempoperdido/1440;
								
		System.out.println("tempo perdido em dias "+ Math.round( tempototal));
				
		
		leia.close();
		
		
		
		

}
	}
