package sorted;

import java.util.Scanner;

public class QueueControllerLalin {

	public static void main(String[] args) {
		int queueSize = 0;
		System.out.println("Enter a queue size: ");
		Scanner sc = new Scanner(System.in);
		queueSize = sc.nextInt();
		sc.close();
		QueueLalin linearQueue = new QueueLalin(queueSize);
		
		for(int i=0; i<queueSize; i++){
			linearQueue.addItem((long)(Math.random()*queueSize));
		}
		long[] x = linearQueue.getArray();
		for(int i = 0; i<queueSize; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
		linearQueue.remove();
		
		for(int i = 0; i<queueSize; i++){
			System.out.print(x[i] + " ");
		}
	}

}
