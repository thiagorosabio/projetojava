package br.com.cit.bootcamp.aula03.modificadores;

public class TestaModificadores {

	public static void main(String[] args) {
		// O uso do var é igual ao usado a classe MeusModificadores
		//var meuModificador = new MeusModificadores();
		//MeusModificadores meuModificador = new MeusModificadores();
		var filha = new FilhaModificadores();
				
		//meuModificador.imprimeMetodoProtected();
		
		filha.ImprimeMetodo();
		
		
	}

}
