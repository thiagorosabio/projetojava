
import java.util.Random;
import java.util.Scanner;

public class Sorteio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random sorteio= new Random();

		boolean acertou=false;
		int tentativas=3;
		int numeroSecreto=sorteio.nextInt(5)+1;
		long chute = 0;
		while(tentativas>0 && acertou ==false){
			 System.out.println("Qual o seu Chute ? ");
			 chute=leia.nextLong();
			
			 if(numeroSecreto==chute) {
				 System.out.println(" Parabéns, Você Acertou o número!!! ");
				 acertou= true;
				 }else if(chute<numeroSecreto) {
					 --tentativas;
					 System.out.println(" Número muito Pequeno "
							 +tentativas+ " faltam restantes");
					 }else {
						 --tentativas;
						System.out.println("Número muito Grande "+ 
						 tentativas + " restantes");        
								            
								    }
			    }    
	}
}
