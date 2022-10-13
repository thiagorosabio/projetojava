//8) Desenvolva um programa que leia uma distância em metros 
//e mostre os valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm


import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Leia a distancia em metros");
		
		double metros = leia.nextDouble();
		double KM = metros /1000;
		double cm = metros* 100;
		double dm = metros* 10;
		double dcam = metros/ 10;
		double HM = metros/ 100;
		double mm = metros* 1000;

		System.out.println("A distancia em metros  é " + metros );
		System.out.println("A distancia  em  KM é " + KM );
		System.out.println("A distancia em mm é " + mm );
		System.out.println("A distancia  em é cm " + cm );
		System.out.println("A distancia em dcam é " + dcam );
		System.out.println("A distancia em HM é " + HM);
		System.out.println("A distancia em dm é " + dm );
		 
		
		leia.close();

		
	}




}
	
	
	
	


