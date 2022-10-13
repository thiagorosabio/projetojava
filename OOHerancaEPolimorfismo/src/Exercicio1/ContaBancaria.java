//Para todos os exercícios, não esqueça de encapsular os atributos com métodos getters e setter, criar os construtores apropriados e também o método toString.
//
//Exercício)01)– Conta)Bancária

//Elabore uma classe ContaBancaria com os seguintes atributos:

//• nomeCliente
//• numConta
//• saldo

//E os seguintes métodos:
//• sacar (o saldo não pode ficar negativo)
//• depositar

//Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes características:

package Exercicio1;

public class ContaBancaria {
	private String nomeCliente;
	private DadosContas numConta;
	private double saldo;

//	Métodos Getters and Setters

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public DadosContas getNumConta() {
		return numConta;
	}

	public void setNumConta(DadosContas numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

//	Método Sacar

	public void sacar(double valor) {
		if(valor > 0) {
			System.out.println("Saque efetuado com sucesso");
		}
			else {
				System.out.println("Operação não concluída, sem saldo em conta");
	
			}
	}
//		Método depositar

	public void depositar(double valor) {
		if (valor > 0) {
			System.out.println("Depósito efetuado com sucesso");
		} else {
			System.out.println("Operação não concluída, sem saldo em conta");
		}

	}
}
