package sorted;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		int[] queue = new int [20];
		int back = 0;
		int front = 0;
		for (int i = 0; i<queue.length; i++){
			double numAsDouble = (Math.random()*100);
			int num = (int)numAsDouble;
			queue[i] = num;
			back++;
		}
		System.out.println(back);
		System.out.println(front);
		System.out.println(Arrays.toString(queue));
		int choice = 0;
		for(;;){
			Scanner sc = new Scanner(System.in);
			System.out.println("What would you like to do?? 1=See the first value in the queue, 2=See value in the position [num], 3=Remove first value, 4=add a number to the end");
			choice = sc.nextInt();
			if(choice == 1){
				System.out.println(queue[0]);
			}else if(choice == 2){
				Scanner num = new Scanner(System.in);
				System.out.println("Which position?");
				int position = num.nextInt();
				System.out.println(queue[(position-1)]);
			} else if(choice == 3){
				System.out.println("The first value is " + queue[0]);
				for(int i = 0; i<queue.length-1; i++){
					int temp = 0;
					temp = queue[(i+1)];
					queue[i] = temp;
					System.out.println(Arrays.toString(queue));
					System.out.println(i);
					if(i==queue.length-2){
						queue[queue.length-1] = 0;
						back--;
						System.out.println(back);
					}
				}
			}else if(choice == 4){
				System.out.println("Checking to see if adding a value is possible...");
				if(back < queue.length){
					System.out.println("You can add a value in, would you like to add a random (r) or your own (c)?");
					Scanner input = new Scanner(System.in);
					String type = input.toString();
					if(type == "r"){
						queue[back+1] = (int) (Math.random());
						back++;
						System.out.println("Succesfully added a value to the end, the list now looks like: ");
						System.out.println(Arrays.toString(queue));
					}else if(type == "c"){
						System.out.println("Please enter your new value:");
						Scanner input1 = new Scanner(System.in);
						int value = input1.nextInt();
						queue[back+1] = value;
					}
				}else{
					System.out.println("The queue is full would you like to remove a value? (y/n) ");
					Scanner yn = new Scanner(System.in);
					String remove = yn.toString();
					if (remove == "y"){
						
					}
				}
			}
			System.out.println(Arrays.toString(queue));
		}
	}
}
