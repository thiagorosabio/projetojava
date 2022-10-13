import java.util.Scanner;

public class e6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("DIAS TRABALHAD0S2");
		int numero = leia.nextInt();
		int antecessor = numero - 1;
		int sucessor = numero + 1;

		System.out.println("O sucessor é " + sucessor + 
				"O atecessor é " + antecessor );
		
		leia.close();

		
	}
}
