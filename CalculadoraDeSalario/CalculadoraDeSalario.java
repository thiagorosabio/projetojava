package br.com.cit.bootcamp.aula02;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario)
	{
		if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo()))
		{
			return dezOuVintePorcento(funcionario); 
		}
		if(Cargo.DBA.equals(funcionario.getCargo()) ||
				Cargo.TESTER.equals(funcionario.getCargo()))
		{
			return quinzeOuVinteCincoPorcento(funcionario);
		}
		
		throw new RuntimeException("funcionario inválido");
	}
	
	
	private double dezOuVintePorcento(Funcionario funcionario)
	{
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() / 0.9;
		}
		
		return funcionario.getSalarioBase() / 0.8;
	}
	
	private double quinzeOuVinteCincoPorcento(Funcionario funcionario)
	{
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() / 0.75;
		}
		
		return funcionario.getSalarioBase() / 0.85;
	}
}
