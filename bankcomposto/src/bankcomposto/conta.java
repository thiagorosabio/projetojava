package bankcomposto;

public class conta {
	
	
		double saldo = 0;
		int agencia;
		int numero;
		Cliente titular;
		
		public void deposita(double valor) {
	        this.saldo += valor;
	    }
	}

	
	
