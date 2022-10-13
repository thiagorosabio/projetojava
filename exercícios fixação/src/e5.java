import java.util.Scanner;

public class e5 {
	
	public static void main(String[] args) {

		Scanner nota = new Scanner(System.in);

		System.out.println("informe nota 1");
		Float nota1 = nota.nextFloat();

		System.out.println("informe nota 2 ");

		Float nota2 = nota.nextFloat();

		System.out.println((nota1+nota2)/2);
		
		nota.close();

	}
}



