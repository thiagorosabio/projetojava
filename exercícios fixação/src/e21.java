import java.util.Scanner;

public class e21 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("infome o ano  ");
		float ano = leia.nextFloat();

		if( ano % 4 ==0) {

			if( ano % 100 ==0) {


				if( ano % 400 ==0) {
					System.out.println("o ano  é Bisexto" );


				}

				else {

					System.out.println("o ano nao é Bisexto" );

				}
			}else {
				System.out.println("o ano é Bisexto" );

			}

		}
		else {
			System.out.println("o ano nao é Bisexto" );


		}








		leia.close();


	}
}
