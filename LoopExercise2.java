package sorted;

import java.util.Scanner;

public class LoopExercise2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("what is your IQ? ");
		int iq = sc.nextInt();
		
		if(iq>200 || iq<50){
			System.out.println("Please enter your real IQ as this is to low/high");
		}else{
			System.out.println("Well done on your IQ of " +iq);
		}

	}

}
