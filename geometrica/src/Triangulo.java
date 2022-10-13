
public class Triangulo implements FormaGeometrica{
	double lado1, lado2, lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public boolean validarTriangulo() {
		// TODO: Implementar depois a validação do triangulo
		return true;
	}

	public double area() {
		return (Math.sqrt(3)*this.lado1)/4;
	}
	
	public double perimetro() {
		return this.lado1 * 3;
	}
}

