import java.util.Scanner;

//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666



public class e7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o numero");
		double valor = leia.nextDouble();
		
		double dobro = valor *2;
		double tercaParte = Math.round( valor/3);
		
		System.out.println(" o dobro do valor é  " + dobro + " A terça parte é " + tercaParte );
	}
	
	

}

