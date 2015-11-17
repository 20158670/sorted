package sorted;

public class TestArray {

	public static void main(String[] args) {
		
		double[] myList = {1.9,2.9,3.5,3.4};
		
		for (int i = 0; i<myList.length; i++){
			System.out.println(i);
		}
		double Total = 0;
		
		for (int i = 0; i<myList.length; i++){
			Total += myList[i];
		}
		System.out.println("The total is " + Total);
		
		double Largest = 0;
		
		for (int i = 0; i<myList.length; i++){
			if (myList[i]>Largest) Largest = myList[i];
		}
		System.out.println("The largest number is " + Largest);
	}

}
