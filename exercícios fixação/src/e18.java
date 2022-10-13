
	import java.util.Scanner;

public class e18 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual seu ano de nascimento ");
		float anonasc = leia.nextFloat();
		float anoatual = 2022 ;
		
		
		if(anoatual - anonasc >= 18) {
			
			System.out.println("Voce pode votar");
			
		}
		
		else  {
			System.out.println("Voce vota" );
			
		}
		
		
		
			
		leia.close();

		
	}
}
