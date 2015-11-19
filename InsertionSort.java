package sorted;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[1000];
		for (int x = 0; x<array.length; x++){
			array[x] = (int)(Math.random()*1000);
		}
		System.out.println(Arrays.toString(array));
		int temp = 0;
		int counter = 0;
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i<array.length; i++){
			while(i > 0 && array[i]<array[i-1]){
				temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
				i--;		
				counter++;
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println(Arrays.toString(array));
		System.out.println("The loops itterated " + counter + " times");
		long timeTaken = timeEnd-timeStart;
		System.out.println("It took " + timeTaken + "ms to complete");
	}

}
