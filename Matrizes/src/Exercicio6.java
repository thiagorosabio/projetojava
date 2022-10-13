//6. Faça um programa para jogar o jogo da velha. O programa deve
//permitir que dois jogadores façam uma partida do jogo da velha,
//usando o computador para ver o tabuleiro. Cada jogador vai
//alternadamente informando a posição onde deseja colocar a sua
//peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//determinar automaticamente quando o jogo terminou e quem foi o
//vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//deve atualizar a situação do tabuleiro na tela.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char[][] jogo = new char[3][3];
        int i =0;
		char jogador1 = 'X';
		char jogador2 = 'O';
		boolean linhaValida = false;
		boolean colunaValida = false;

//		Recebe as informações de posição escolhida do jogador1
		do {
		System.out.println("Jogador 1, escolha a linha, opção 1, 2 ou 3");
		 i = leia.nextInt();
		if(i > 0 && i <= 3) {
			linhaValida = true;

		}else {
			System.out.println("Opção inválida, tente novamente.");
	
		}while(!linhaValida);
			
		System.out.println("Jogador 1, escolha a coluna, opção 1, 2 ou 3");
		int j = leia.nextInt();
		if(i > 0 && i <= 3) {
			colunaValida = true;

		}else {
			System.out.println("Opção inválida, tente novamente.");
		
//		Comparando se a opção está preenchida ou não.

		if (jogo[i][j] == 'X' || jogo[i][j] == 'O') {
			System.out.println("Opção inválida, tente novamente");
		} else {
			jogo[i][j] = 'X';
		}
//		Recebe as informações de posição escolhida do jogador2
		
		System.out.println();
		
		System.out.println("Jogador 2, escolha a linha, opção 1, 2 ou 3");
		int k = leia.nextInt();
		if(k > 0 && k <= 3) {
			linhaValida = true;

		}else {
			System.out.println("Opção inválida, tente novamente.");
			
			
		System.out.println("Jogador 2, escolha a coluna, opção 1, 2 ou 3");
		int l = leia.nextInt();
		if(l > 0 && l <= 3) {
			colunaValida = true;

		}else {
			System.out.println("Opção inválida, tente novamente.");

//		Comparando se a opção está preenchida ou não.
		}
		if (jogo[k][l] == 'X' || jogo[k][l] == 'O') {
			System.out.println("Opção inválida, tente novamente");
		} else {
			jogo[k][l] = 'O';
		}}
		
		




