package revisao;

public class resvisaofatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			fatorial *= i;
			if (fatorial % 2 == 0) {

				System.out.println("Fatorial par de" + i + " é: " + fatorial);
			} else {
				System.out.println("Fatorial impar de" + i + " é: " + fatorial);

			}
		}

	}
}
