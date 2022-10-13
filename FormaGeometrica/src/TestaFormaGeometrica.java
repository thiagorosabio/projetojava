
public class TestaFormaGeometrica {
	public static void main(String[] args) {
		FormaGeometrica circulo = new Circulo(4);
		System.out.println("A área do Círculo é " + circulo.area());
		System.out.println("O comprimento do Círculo é " + circulo.comprimento() + "\n");
		
		Quadrado quadrado = new Quadrado(4);
		FormaGeometrica fGquadrado = (FormaGeometrica) quadrado;
		
		System.out.println("A área do Quadrado é " + fGquadrado.area());
		System.out.println("O comprimento do Quadrado é " + fGquadrado.comprimento() + "\n");
		
	}

}
