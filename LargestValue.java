package sorted;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		//Number entering system
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i<4; i++){
			for (int j = 0; j<5; j++){
				System.out.print("Please enter the number: ");
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println(max(a));
	}
	public static int max(int[][] a){
		int max = 0;		
		for (int i = 0; i<4; i++){
			for (int j = 0; j<5; j++){
				if (a[i][j] > max){
					max = a[i][j];
				}
			}
		}
		return max;		
	}
	
}
