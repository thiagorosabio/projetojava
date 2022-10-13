
public class Quadrado implements FormaGeometrica {

	
	
	private double lado;
	
	@Override
	public double area() {
	return lado*lado;
	}

	@Override
	public double comprimento() {
	return lado;
	}

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		
		return 0;
	}
	
}
	
	