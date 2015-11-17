package sorted;

import java.util.Scanner;

public class ScoringMachine {

	private static Scanner sc;
	
	public static void main(String[] args) {
		int quizScore = 0;
		int termScore = 0;
		int finalScore = 0;
		
		sc = new Scanner(System.in);
		System.out.print("Enter your quiz score: ");
		quizScore=sc.nextInt();
		System.out.print("Enter your mid-term score: ");
		termScore=sc.nextInt();
		System.out.print("Enter your final's score: ");
		finalScore=sc.nextInt();
		
		int average = (quizScore + termScore + finalScore)/3;
		
		System.out.println("Your average is" + average);
		
		if (average >=90){
			System.out.print("You scored an 'A' grade");	
		}else if(average >=70){
			System.out.print("You scored an 'B' grade");	
		}else if(average >=50){
			System.out.print("You scored an 'C' grade");	
		}else if(average <50){
			System.out.print("You have failed the year");	
		}
	}

}
