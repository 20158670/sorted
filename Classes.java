package sorted;

public class Classes {
	public static void main(String[] args) {
		char grade = 'f';
		switch(grade)
		{
		case 'a':
			System.out.print("Excellent");
			break;
		case 'b':
			System.out.print("Good job");
			break;
		case 'c':
			System.out.print("Well done");
			break;
		case 'd':
			System.out.print("You passed");
			break;
		case 'e':
			System.out.print("Better try again");
			break;
		case 'f':
			System.out.print("You failed badly");
			break;
		default:
			System.out.print("Invalid Grade");
		}
		System.out.print(", Your grade is: " + grade);
	}
	
}
