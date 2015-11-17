package sorted;

public class FullName {

	public static void main(String[] args) {
		String firstName = "Sam";
		String lastName = "Malcolm";
		String fullName = firstName + " " + lastName;
		String anotherSam = "Sam";
		String firstNameRepeated = firstName;
		String lastNameAgain = new String("Malcolm");
		
		System.out.println(fullName);
		/*
		 * returns Sam Malcolm
		 */
		System.out.println(lastNameAgain);
		/*
		 * Should return a memory address - doesn't, don't know why...
		 */
		System.out.println("First name equals last name " + firstName.equals(lastName));
		/*
		 * Returns false as they are not the same
		 */
		System.out.println("First name equals another sam " + firstName.equals(anotherSam));
		/*
		 * returns true as they have the same heap address
		 */
		System.out.println("First name equals firstname repeated " + firstName.equals(firstNameRepeated));
		/*
		 * Returns true as they also have the same memory address 
		 */
		System.out.println("Last name equals last name again " + lastName.equals(lastNameAgain));
		/*
		 * Should return false as they are not the same - returned true as they are the same or both ultimately contain the same address
		 */
		System.out.println("Last name equals equals last name again" + lastName == lastNameAgain);
		/*
		 * Returns false as one of them contains a heap memory location and the other contains a heap memory location whereas the other contains a string constant pool location
		 */
		
		
		
		
	}

}
