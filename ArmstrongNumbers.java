package sorted;
import java.util.Scanner;


public class ArmstrongNumbers {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		String input = scanner.nextLine();
		int numUsing = Integer.parseInt(input);
		
		int afterMaths = 0;
		
		for(int i=0; i<input.length(); i++){
			char c = input.charAt(i);
			int num = Integer.parseInt(c + "");
			afterMaths +=  Math.pow(num, 3);			
		}
		
		if (numUsing == afterMaths){
			System.out.println("The number is a Armstrong Number");
		}else{
			System.out.println("The number is not an armstrong Number");
		}
		
	}

}
