package sorted;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[100];
		for (int x = 0; x<array.length; x++){
			array[x] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(array));
		int temp = 0;
		for (int i = 0; i<array.length; i++){
			while(i > 0 && array[i]<array[i-1]){
				temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
				i--;
			}
		}
		int start = 0;
		int end = array.length-1;
		int mid = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number that you are looking for: ");
		int lookingFor=sc.nextInt();
		for (int i =0; i<array.length; i++){
			mid = (start+end)/2;
			if(array[mid] == lookingFor){
				System.out.println("The value that you are looking for has been found");
				break;
			}else if(array[mid]>lookingFor){
				end = (mid-1);
				System.out.println("The value that you are looking for hasn't been found in the top half");
			}else{
				start = (mid+1);
				System.out.println("The value that you are looking for hasn't been found in the bottom half");
			}
		}
		sc.close();
	}

}
