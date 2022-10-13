import java.util.Scanner;

//Sistema de banco
//
//Contas bancárias:
//  - Atributos: Toda conta tem um número e 
//uma agência.
//    (OBS: Não são os únicos atributos).
//  - Saque: Remover uma quantia específica do saldo 
//da conta
//  - Depósito: Adicionar uma quantia específica 
//no saldo da conta
//  - Calcular rendimentos da conta: 
//    - Por mês, a conta rende 5% do saldo. 
//Mostrar a prévia do rendimento ao usuário

public abstract class Banco {

	Scanner scanner = new Scanner(System.in);
	// Atributos

	private double agencia;
	private double numeroConta;
	private String cliente;
	private String cpf;
	private double saldoAtual = 0.00;
	

	// Construtores

	public Banco(double agencia, double numeroConta, String cliente, 
			 String cpf) {

		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.cpf = cpf;
	}

	// Getters e Setters

	public double getAgencia() {
		return agencia;
	}

	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public double getSaldoAtual() {
		return saldoAtual;

	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}


	// Método FazerSaque

	
	public void FazerSaque() {
		System.out.println("Quanto você gostaria de sacar? ");
		 double valor = scanner.nextDouble();
		
		
		if (saldoAtual >= valor) {
			this.saldoAtual = this.saldoAtual - valor;
			System.out.println("Saque de"+ valor + "efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

	// Método FazerDeposito

	public void FazerDeposito(double valor) {
		this.saldoAtual = this.saldoAtual + valor;
		System.out.println("Depósito efetuado com sucesso!");
	}

	// Método Saldo

	public double saldo() {
	
	System.out.println("O seu saldo é de:"+ this.saldoAtual);
	
		return saldoAtual;
	
	
	}







}
