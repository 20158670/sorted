package sorted;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = new int[1000];
		for (int x = 0; x<array.length; x++){
			array[x] = (int)(Math.random()*1000);
		}
	int[] pos = new int [array.length];
	for(int i = 0; i<pos.length; i++){
		pos[i] = -1;
	}
	Scanner sc = new Scanner(System.in);
	System.err.println("Please enter the number that you are looking for: ");
	int searchValue = sc.nextInt();
	boolean found = false;
	int counter = 0;
	for(int i=0; i<array.length; i++){
		if(array[i] == searchValue){
			pos[counter] = i;
			found = true;
			counter++;
		}
	}
	if(found){
		System.err.print("The number '" + searchValue + "' was found " + counter + " times, it was found in positions ");
		int nums = 0;
		for(int i = 0; i<pos.length; i++){
			if(pos[i]!= -1){
				System.err.print( (nums > 0 ? ", " : " ") + (pos[i]+1));
				nums++;
			}
		}
	}else{
		System.err.println("The number " + searchValue + " was not found");
	}
	sc.close();
	}
}