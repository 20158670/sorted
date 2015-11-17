package sorted;
import java.util.*;

public class Exercise1 {

	private static Scanner sc;
	public static void main(String[] args) 
	{
		checkElegibility();
	}
	static void checkElegibility(){
		int age;
		sc = (new Scanner(System.in));
		System.out.print("What is your age? ");
		age=sc.nextInt();
		
		if(age>=18)
			System.out.print("Lets get married");
		else
			System.out.print("Hmmm, aren't you a bit too young??");
	}
}