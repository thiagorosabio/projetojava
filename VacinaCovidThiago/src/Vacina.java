
public abstract class Vacina {

	public boolean regraIdade(int idade) {
		
		
		return idade >= 5 && regra(idade) ;
	}

	protected  abstract boolean regra(int idade);
}
