package controller;

public class ControllerExercicio2 extends Thread {

	private int[][] M = new int[3][5];
	private int x, y;

	public ControllerExercicio2(int[][] M, int x) {
		this.M = M;
		this.x=x;

	}

	private void Calcular() {
		int c=x;
		int Soma=0;

		for (c = x; c <= x; c++) {
			for (y = 0; y <= 4; y++) {
				Soma+=M[c][y] ;			
			}
			System.out.println("Thread " +c+ " Soma :"+ Soma);
			Soma=0;			
		}
	}

	public void run() {
		Calcular();
	}

}
