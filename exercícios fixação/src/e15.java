import java.util.Scanner;

public class e15 {

	
			public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("dias trabalhados");
			int  dias = leitor.nextInt();

			System.out.println("informe seu salario");
			float salario = 25*8* dias;
			
			System.out.println("O funcionario " + dias + " tem o salario de R$ "
			+ salario + " no mes ");

			leitor.close();

		}

}
