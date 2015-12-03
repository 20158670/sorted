package sorted;

import java.util.Arrays;
import java.util.Scanner;

public class QueueSystemNew {

	public static void main(String[] args) {
		int[] queue = new int [20];
		int back = 0;
		int front = 0;
		for (int i = 0; i<queue.length; i++){
			int num = randomnumber();
			queue[i] = num;
			back++;
		}
		System.out.println(back);
		System.out.println(front);
		System.out.println(Arrays.toString(queue));
		makingTheChoice(queue);
	}
	public static int randomnumber(){
		double numAsDouble = (Math.random()*100);
		int num = (int)numAsDouble;
		return num;
	}
	public static void makingTheChoice(int[] queue){
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to do?? 1=See the first value in the queue, 2=See value in the position [num], 3=Remove first value, 4=add a number to the end");
		choice = sc.nextInt();
		if(choice == 1){
			choice1(queue);
		}else if(choice == 2){
			choice2(queue);
		}else if(choice == 3){
			choice3(queue, choice);
		}else if(choice == 4){
			choice4(queue, choice);
		}
		sc.close();
	}
	public static void choice1(int[] queue){
		System.out.println(queue[0]);
		makingTheChoice(queue);
	}
	public static void choice2(int[] queue){
		Scanner num = new Scanner(System.in);
		System.out.println("Which position?");
		int position = num.nextInt();
		System.out.println(queue[(position-1)]);
		makingTheChoice(queue);
		num.close();
	}
	public static void choice3(int[] queue, int back){
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
		makingTheChoice(queue);
	}
	public static void choice4(int[] queue, int back){
		System.out.println("Checking to see if adding a value is possible...");
		if(back < queue.length){
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("You can add a value in, would you like to add a random (r) or your own (c)?");
			String type = input.toString();
			if(type == "r"){
				queue[back+1] = (int) (Math.random());
				back++;
				System.out.println("Succesfully added a value to the end, the list now looks like: ");
				System.out.println(Arrays.toString(queue));
			}else if(type.equalsIgnoreCase("c")){
				System.out.println("Please enter your new value:");
				@SuppressWarnings("resource")
				Scanner input1 = new Scanner(System.in);
				int value = input1.nextInt();
				queue[back+1] = value;
			}
		}else{
			System.out.println("The queue is full would you like to remove a value? (y/n) ");
			@SuppressWarnings("resource")
			Scanner yn = new Scanner(System.in);
			String remove = yn.toString();
			if (remove == "y"){
				choice3(queue, back);
			}
		}
		makingTheChoice(queue);
	}
}
