package cartao;

	public class CartaoDeCreditoFactory {
		
		public CartaoDeCredito retornaCartaoDeCredito (String numero) {
			
			Visa visa = new Visa();
			Master master = new Master();
			Amex amex = new Amex();
			
			if (visa.validaCartao(numero)) {
				return new Visa();
			}else if (master.validaCartao(numero)) {
				return new Master();			
			}else if (amex.validaCartao(numero)){
				return new Amex();
			}
			return null;
		}
		}

	

	
	