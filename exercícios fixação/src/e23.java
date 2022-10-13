
import java.util.Scanner;

public class e23 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double valorDesconto;

		System.out.println("infome o  nome ");
		String nome = leia.nextLine();

		System.out.println("infome o  sexo ");
		String sexo = leia.nextLine();

		System.out.println("infome o  valor compra ");
		double valorCompra = leia.nextDouble();

		if (sexo.equals("feminino") || sexo.equals("f")) {
			valorDesconto = valorCompra * 0.15;
			System.out.println("o valor do desconto feminino " + valorDesconto);
					
		} else if (sexo.equals("masculino") || sexo.equals("m") ) {
			valorDesconto = valorCompra * 0.05;
			System.out.println("o valor do desconto masculino  " + valorDesconto);
		}
		
		
	}
}

