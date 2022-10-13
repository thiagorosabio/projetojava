
	import java.util.Scanner;

	public class e17 {

		public static void main(String[] args) {

			// perguntar qual a volicidade do carro 
			// ler velocidade criar variavel inteiro
			
			// cria condiçao para validar se a variavel é maior que 80
			// se verdade imprima sms
			// calcular valor da muita(valor-80)*5
			
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("qual a velocida do carro  ");
			float km = leia.nextFloat();
			
			float multa = (km-80)*5 ;
			
			
			if( km > 80) {
				System.out.println("Voce foi multado em R$" + multa);
				
				System.out.println("Sua velocidade é de " + km
	                    + " Km/h, " + " voce está rapido de mais alivia o pé"
	                    		+ " seu pé de chumbo" );
				
							}
			
			else  {
				System.out.println("conduzindo Miss Daisy" );
				System.out.println("Pisa fundo no java se nao voce fica de fora ");
                
				
			}
			
			
			
				
			leia.close();

			
		}
	}



