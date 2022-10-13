package cartao;

public class testacartao {
	
	 public static void main(String[] args){
		 CartaoDeCreditoFactory fabrica = new CartaoDeCreditoFactory();
		 
		 CartaoDeCredito cartao = fabrica.retornaCartaoDeCredito("855432411234");
		 
		 System.out.println(cartao);
		 

}
}