import java.util.Random;
import java.util.Scanner;


public class Conta {
	
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	private int agencia = 1;
	private int numConta = random.nextInt(1000, 2000);
	private double saldo = 0;
	private Cliente titular;
	
	public Conta() {}
	
	public void exibirCabecalho() {
		
		System.out.println("******************************");
		System.out.println("Nome: " + this.titular.getNomeCliente());
		System.out.println("CPF: " + this.titular.getCpf());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("******************************");
	}
	
	public double saldo() {
		
		exibirCabecalho();
		
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("******************************");
		
		return saldo;
	}
	
	
	public double sacar() {
		System.out.println("Digite o valor a sacar: ");
		double valor = scanner.nextDouble();
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			exibirCabecalho();
			
			System.out.println("Valor sacado: R$ " + valor);
			System.out.println("Saldo: R$ " + saldo);
			System.out.println("******************************");
		}
		
		else {
			exibirCabecalho();
			
			System.out.println("Saldo insuficiente");
			System.out.println("******************************");
		}
		return valor;
	}
	
	public double depositar() {
		
		System.out.println("Digite o valor a depositar: ");
		double valor = scanner.nextDouble();
		
		this.saldo += valor;
		
		exibirCabecalho();
		
		System.out.println("Valor depositado: R$ " + valor);
		System.out.println("Saldo R$ " + saldo);
		System.out.println("******************************");
		
		return valor;
	}
	
	public boolean transferir() {
		System.out.println("Digite o valor a transferir: ");
		double valor = scanner.nextDouble();
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			Conta destino = new Conta();
			
			scanner.nextLine();
			System.out.println("Digite o nome do titular da conta destino: ");
			String nomeClienteDestino = scanner.nextLine();

			System.out.println("Digite o cpf do titular da conta destino: ");
			String cpfClienteDestino = scanner.nextLine();
				
			Cliente novoCliente = new Cliente(nomeClienteDestino,cpfClienteDestino);
			
			destino.setSaldo(getSaldo() + valor);
			
			System.out.println("******************************");
			System.out.println("*COMPROVANTE DE TRANSFERÊNCIA*");
			System.out.println("******************************");
			System.out.println("Favorecido: " + novoCliente.getNomeCliente());
			System.out.println("CPF: " + novoCliente.getCpf());
			System.out.println("Agência: " + destino.getAgencia());
			System.out.println("Conta: " + destino.getNumConta());
			System.out.println("Valor recebido: R$ " + valor);
			System.out.println("******************************");
			
			return true;
		}else {
			exibirCabecalho();
			
			System.out.println("Saldo insuficiente");
			System.out.println("******************************");
			return false;
		}
	}
	
		
	public double calcularRendimento() {
		
		double rendimento;
		rendimento = this.saldo * 0.05;
		
		exibirCabecalho();
		
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("Rendimento mensal: R$ " + rendimento);
		System.out.println("******************************");
		
		return rendimento;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
