package sorted;


public class primeNumbers {


	public static void main(String[] args) {
		int counter =0;
		for(int i = 1; i<=1000; i++){
			
			for(int x = 1; x<i; x++){
				if(i%x == 0){
					counter++;					
				}
			}
			if(counter ==2){
				System.out.println(" prime "+ i);
			}
			counter = 0;
		}
	}
}
