package sorted;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int x = 0; x<arr.length; x++){
			arr[x] = (int)(Math.random()*1000);
		}
		System.out.println(Arrays.toString(arr));
		int temp;
		int counter =0;
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i<arr.length-1; i++){
			for (int j = 0; j<arr.length-1; j++){
				if (arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					counter ++;
				}
				
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		System.out.println("The loops itterated " + counter + " times");
		long timeTaken = timeEnd-timeStart;
		System.out.println("It took " + timeTaken + "ms to complete");
	}

}
