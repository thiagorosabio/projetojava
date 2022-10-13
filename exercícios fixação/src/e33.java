
import java.util.Scanner;

	public class e33 {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			System.out.println("informe o valor da casa");
			float casa = leia.nextFloat();
			
			System.out.println("informe o valor do salario");
			float salario = leia.nextFloat();
			
			System.out.println("informe o tempo do emprestimo em anos");
			float anos = leia.nextFloat();
			float valor = casa/(anos * 12);
			float saldo = (float) (salario *0.3); 
			
			if(valor > saldo) {
					
			System.out.println(" emprestimo negado");
			}
			else {
				System.out.println(" emprestimo aprovado");
				
				
			}
								
			
			
			
			leia.close();

			
		}
	}





