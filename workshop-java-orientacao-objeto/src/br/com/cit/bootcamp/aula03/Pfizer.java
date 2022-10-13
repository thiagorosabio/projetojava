package br.com.cit.bootcamp.aula03;

public class Pfizer extends Vacina {
	
	private String nome = "Pfizer";
	
	public String getNome() {
		return this.nome;
	}

	/*
	 * Regra: Numero de dias para vacinar deve ser maior que 122 dias
	 *  e numero de vacinas ser menor que 2 e seguir a regra de idade.
	 */
	public boolean regraBoolean(CartaoDeVacinacao cartaoVacinacao) {
		
		return  cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 2
				&& this.regraIdade(cartaoVacinacao.getPessoa());
	}

	@Override
	public void regraVoid(CartaoDeVacinacao cartaoVacinacao) {
		System.out.println("O(a) " + cartaoVacinacao.getPessoa().getNome() +
				" que optou pela vacina Pfizer pode tomar vacina?");
		if (cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 2
				&& this.regraIdade(cartaoVacinacao.getPessoa())) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
	}

}
