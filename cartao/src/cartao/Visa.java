package cartao;

public class Visa implements CartaoDeCredito {

	private char prefixo = '4';
	
	public char getPrefixo() {
		return prefixo;
	}
	
	public boolean validaCartao(String numero) {

		return numero.charAt(0) == prefixo;
	}		
}
