package br.com.cit.bootcamp.aula02;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario)
	{
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
	
	

}
