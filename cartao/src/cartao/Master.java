package cartao;

public class Master implements CartaoDeCredito{

	private char prefixo = '5';
	
	public char getPrefixo() {
		return prefixo;
	}
	
	public boolean validaCartao(String numero) {
		
		return numero.charAt(0) == prefixo;
	}

}
