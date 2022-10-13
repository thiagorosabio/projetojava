package br.com.cit.bootcamp.aula03Parte2;

public class CalculaImposto {
	
	// ICMS = 20%
	// ISS = 15%
	// TX = 10%
	public static double calculaImposto(Orcamento orcamento)
	{
		return orcamento.getValor() * 0.8;
	}
}
