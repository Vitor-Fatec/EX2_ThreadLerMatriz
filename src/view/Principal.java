package view;

import controller.ThreadLerMatriz;

public class Principal {

	public static void main(String[] args) {
		int matriz [][] = new int[3][5];
		
			
		for(int l = 0; l < 3; l ++) {
			for(int c = 0; c < 5; c ++) {
				matriz[l][c] = (int) (Math.random() * 11) ;
			}	
	}
		for(int l = 0; l < 3; l ++) {
			for(int c = 0; c < 5; c ++) {
			}
	}
		
		for(int i = 0; i < 3; i ++) {
			Thread ler = new ThreadLerMatriz(matriz, i);
			ler.start();
		}

	
	}	
}
