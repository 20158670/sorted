package sorted;

import java.util.Scanner;

public class LoopExercise1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("How old are you?? ");
		int userage = sc.nextInt();
		if(userage>150){
			System.out.println("This is a rogue value, please enter your real age");
		}else{
			System.out.println("Congratulations on being " +userage);
		}
	}

}
