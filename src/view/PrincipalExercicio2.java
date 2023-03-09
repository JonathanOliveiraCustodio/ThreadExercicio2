package view;

import controller.ControllerExercicio2;

public class PrincipalExercicio2 {

	public static void main(String args[]) {

		int[][] M = new int[3][5];
		int x, y;
		String Exibir = "";

		for (x = 0; x <= 2; x++) {
			for (y = 0; y <= 4; y++) {
				M[x][y] = (int) (1 + Math.random() * 10);
			}

		}

		for (x = 0; x <= 2; x++) {
			Exibir += " ";
			for (y = 0; y <= 4; y++) {
				Exibir += " |" + M[x][y] + " |";
			}
			Exibir += "\n";
		}
		System.out.println("Matriz" + '\n' + Exibir);

		Thread t1 = new ControllerExercicio2(M, 0);
		
		Thread t2 = new ControllerExercicio2(M, 1);
		
		Thread t3 = new ControllerExercicio2(M, 2);
		
		t1.start();
		t2.start();
		t3.start();

	}


}
