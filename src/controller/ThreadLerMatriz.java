package controller;

public class ThreadLerMatriz extends Thread{

	private int[][]matriz= new int [3][5];
	private int i;
	
	
	public ThreadLerMatriz(int[][]matriz, int i) {
		this.matriz = matriz;
		this.i = i;
	}
		
	
	@Override
	public void run() {
		calculo();
	}
	
	private void calculo() {
	int tempo = 100;
	int soma = 0;
	try {
		sleep(tempo * i);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		switch(i) {
		case 0:
			System.out.print("TDI#" +getId());
			for( int c = 0; c < 5; c++) {
				soma += matriz[i][c];
				System.out.print("    "  + matriz[i][c]);
			}
			System.out.println("    Número do I  " + i);
			System.out.println("\n");
			System.out.println("Soma == " + soma);
			System.out.println("\n");
			break;
			
		case 1:
			System.out.print("TDI#" +getId());
			for( int c = 0; c < 5; c++) {
				soma += matriz[i][c];
				System.out.print("    "  + matriz[i][c]);
			}
			System.out.println("    Número do I  " + i);
			System.out.println("\n");
			System.out.println("Soma == " + soma);
			System.out.println("\n");
			break;
		case 2:
			System.out.print("TDI#" +getId());
			for( int c = 0; c < 5; c++) {
				soma += matriz[i][c];
				System.out.print("     "  + matriz[i][c]);
			}
			System.out.println("    Número do I  " + i);
			System.out.println("\n");
			System.out.println("Soma == " + soma);
			System.out.println("\n");
			break;
		}
	}
	
}
