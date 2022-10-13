
import java.util.Scanner;

public class e7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("informe o numero");
		float numeroreal = leia.nextFloat();
		float dobro = numeroreal;
		float tercaparte = numeroreal;
		dobro=dobro*2;
		tercaparte = tercaparte/3;

		System.out.println("O numero real  é " + numeroreal + "O dobro é " + dobro + 
				 " a terça parte é " + tercaparte);
		
		leia.close();

		
	}
}
