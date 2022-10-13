import java.util.Scanner;

public class e12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double valorDesconto;

		System.out.println("infome o  valor compra ");
		double valorCompra = leia.nextDouble();

		valorDesconto = valorCompra * 0.95;
			System.out.println("o valor do desconto  " + valorDesconto);
		leia.close();
	}
		
		
	}



	