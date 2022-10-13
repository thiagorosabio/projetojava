package br.com.cit.bootcamp.aula02;

public enum Cargo {
	DBA (new quinzeOuVinteCincoPorcento()),
	DESENVOLVEDOR (new dezOuVintePorcento()),
	TESTER (new quinzeOuVinteCincoPorcento());
	
	private RegraDeSalario regra;
	Cargo(RegraDeSalario regra) {
		this.regra = regra;
	}
	
	public RegraDeSalario getRegra()
	{
		return this.regra;
	}
}
