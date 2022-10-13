
	import java.util.Scanner;

	public class e8 {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			System.out.println("informe a discia em metos");
			float metros = leia.nextFloat();
			float KM = metros /1000;
			float cm = metros* 100;
			float dm = metros* 10;
			float dcam = metros/ 10;
			float HM = metros/ 100;
			float mm = metros* 1000;
			
			
			System.out.println("A distancia em metros  é " + metros );
			System.out.println("A distancia  em  KM é " + KM );
			System.out.println("A distancia em mm é " + mm );
			System.out.println("A distancia  em é cm " + cm );
			System.out.println("A distancia em dcam é " + dcam );
			System.out.println("A distancia em HM é " + HM);
			System.out.println("A distancia em dm é " + dm );
			 
			 
					 		
			leia.close();

			
		}
	}


