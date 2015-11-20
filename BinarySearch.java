package sorted;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		while(6!=7){
			int[] array = new int[1000];
			for (int x = 0; x<array.length; x++){
				array[x] = (int)(Math.random()*1000);
			}
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
			System.out.println(Arrays.toString(array));
			int lookingFor=(int)(Math.random()*1000);
			boolean found = false;
			for (int i =0; i<array.length; i++){
				mid = (start+end)/2;
				if(array[mid] == lookingFor){
					found = true;
				}else if(array[mid]>lookingFor){
					end = (mid-1);
				}else{
					start = (mid+1);
				}
			}
			System.out.println(found?(lookingFor + " was found"):(lookingFor +" wasn't found"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//sc.close();
		}
	}

}
