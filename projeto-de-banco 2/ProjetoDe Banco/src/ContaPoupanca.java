public class ContaPoupanca extends Banco {

	
	
	
	// Construtores

	public ContaPoupanca(double agencia, double numeroConta, String cliente, String cpf) {
		super(agencia, numeroConta, cliente, cpf);
	}
	
	
	
//Método CalcularRendimento
	@Override
	public double calcularRendimento() {

		double rendimentoAoMes = (0.05 * getSaldoAtual());

		return rendimentoAoMes;
	}
}
