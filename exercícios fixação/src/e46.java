//46) Crie um programa que calcule e mostre na tela o resultado da soma 
//entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
public class e46 {

	public static void main(String[] args) {
		
	int numero=4;
		int  soma = 0; 
		
	while(numero<10) {
			numero=numero+2; 
			soma=soma+numero;
		System.out.println(numero);
		System.out.println("parcial = " + soma);
		}
		System.out.println("total = "+ soma);
		for(int i = 4 ;i<10;i=i+2) {
			 
			soma = soma + i;
			System.out.println(i);
			System.out.println("parcial = " + soma);