package sorted;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		int[] arr1 = {0,1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6,7};
		int[] arr3 = {0,1,2,3,4,5,6};
		int[] arr4 = {};
		int[] arr5 = {};
		
		int[] x = new int[]{1,2,3,4,5};
		int[] y = new int[]{1,2,3,4,5};
		
		for(int i=0; i< x.length; i++){
			x[i]=i;
			y[i]=i;
			
		}
		System.out.println("Array 1 equals array 2 is " + Arrays.equals(arr1, arr2));
		System.out.println("Array 2 equals array 3 is " + Arrays.equals(arr2, arr3));
		System.out.println("Array 1 equals array 3 is " + Arrays.equals(arr1, arr3));
		System.out.println("Array 4 equals array 5 is " + Arrays.equals(arr4, arr5));
		System.out.println("Array x equals array y is " + Arrays.equals(x, y));
		
	}

}
