package cartao;

public class Amex implements CartaoDeCredito {
	
	private char prefixo = '6';
	
	public char getPrefixo() {
		return prefixo;
	}
	
	public boolean validaCartao(String numero) {		
		return numero.charAt(0) == prefixo;
	}
}
