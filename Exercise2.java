package sorted;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int[][] a = new int[5][3];
		//Number entering system
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i<a.length; i++){
			for (int j = 0; j<a[0].length; j++){
				System.out.print("Player number "+ (i+1) + " What is your score for game " + (j+1) + " ");
				a[i][j] = sc.nextInt();
			}
		}
		//Box making system
		for (int i = 0; i<a.length; i++){
			System.out.print("Player " + (i+1) + " ");
			for (int j = 0; j<a[0].length; j++){
				System.out.print("|" + a[i][j]);				
			}
			System.out.println("|");
		}
	sc.close();
	}

}
