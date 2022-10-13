package bankHeranca;

public class TesteGerenteSenior {

	
	    public static void main(String[] args) {
	        GerenteSenior gerenteSenior = new GerenteSenior();
	        
	        gerenteSenior.setSetor("DevOps");
	        
	        System.out.println(gerenteSenior.getSetor());
	        
	        gerenteSenior.setNome("Juan");
	        
	        System.out.println(gerenteSenior.getNome());
	    }
	}

