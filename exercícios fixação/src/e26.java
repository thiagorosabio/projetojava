
 import java.util.Scanner;

public class e26 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual valor de A ");
		float valorA = leia.nextFloat();
		
		System.out.println("qual valor de B ");
		float valorB = leia.nextFloat();
		
		if(valorA == valorB) {
			
			System.out.println("Valor A é igual a Valor B");
			
		}
		else if(valorA < valorB ) { 
			System.out.println("Valor A é menor que Valor B");
			
		}
		
		if(valorA > valorB) {
			System.out.println("Valor A é maior que Valor B");
			
		}
		
			
		leia.close();

		
	}
}
