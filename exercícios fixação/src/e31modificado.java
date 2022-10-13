import java.util.Scanner;
public class e31modificado {
    public static void main(String[] args) {
        int jogador,computador;
        Scanner leia = new Scanner(System.in);
        System.out.println("------------");
        System.out.println("JOGO JOKENPO");
        System.out.println("------------");
        System.out.println();
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("Digite a opção desejada:");
//        Lógica do jogador.
        jogador = leia.nextInt();
        
           mostrarescolha(jogador);
           
        //lógica do computador
        computador = (int)(Math.random()*3+1);
        System.out.println();
        switch (computador) {
    case 1:
        System.out.println("O computador escolheu Pedra.");
        break;
    case 2:
        System.out.println("O computador escolheu Papel.");
        break;
    case 3:
        System.out.println("O computador escolheu Tesoura.");
        break;
        }
        //Lógica para determinar o vencedor
        System.out.println();
        if (jogador == computador) {
            System.out.println("EMPATE!");
            
        }else if((jogador == 1 && computador==3)||(jogador == 2 && 
        		computador == 1)||(jogador == 3 && computador ==2)){
            System.out.println("JOGADOR VENCEU!");
            
        }else {
            System.out.println("COMPUTADOR VENCEU!");
        }
        leia.close();    
        
    }
    public static void mostrarescolha( boolean ecomputador, int jogador ) {
    	
    	String nome; 
    	
    	if(ecomputador==true ) {
    		nome = "computador";
    		   			
    	}
    	
    	
    	else{
    		nome = "jogador";
    	}
    	  	
    	switch (jogador) {
        case 1: 
            System.out.println("  escolheu Pedra." + nome);
            break;
        case 2:
            System.out.println("escolheu Papel."+ nome);
            break;
        case 3:
            System.out.println("escolheu Tesoura."+ nome);
            break;

        default:
            System.out.println("Opção inválida!");
            break;
        }
	}
	

 
}


    