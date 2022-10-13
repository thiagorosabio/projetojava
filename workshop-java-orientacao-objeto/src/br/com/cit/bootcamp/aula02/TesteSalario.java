package br.com.cit.bootcamp.aula02;

public class TesteSalario {

	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		
		Funcionario thiago = new Funcionario();
		thiago.setCargo(Cargo.DESENVOLVEDOR);
		thiago.setSalarioBase(3000.0);
		
		double salario = calculadora.calcula(thiago);
		
		System.out.println(salario);
		
	}

}
