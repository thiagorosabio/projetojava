package br.com.cit.bootcamp.aula02Enum;

public enum Cargo{
	
    DBA (new QuinzeOuVinteCincoPorcento()),
	DESENVOLVEDOR (new DezOuVintePorcento()),
	TESTER (new QuinzeOuVinteCincoPorcento()),
	ESTAGIARIO (new TrintaOuQuarentaPorCento()),
	DIRETOR (new CinquentaOuSetentaPorcento()),
	GERENTE (new CinquentaOuSetentaPorcento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra)
	{
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra()
	{
		return regra;
	}
}


