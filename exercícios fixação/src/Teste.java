
import java.util.Scanner;

public class Teste {
    
	public static void main(String[] args) {
       
		Scanner leia = new Scanner(System.in);
        
        System.out.println("VERIFICAR VELOCIDADE");
        
        System.out.println("Informe a sua velocidade");
        float velocidadeCarro = leia.nextFloat();
        
        float multa = (velocidadeCarro - 80)*5;
        if (velocidadeCarro > 80) {
            System.out.println("Sua velocidade é de " + velocidadeCarro
                    + " Km/h, " + "está acima do permitido" );
            System.out.println("Você deve pagar uma multa de R$"
                    +String.format("%.2f", multa));
        }else {
            System.out.println("Parabéns, você foi prudente na sua viagem! ");
                    

        }

    }
}