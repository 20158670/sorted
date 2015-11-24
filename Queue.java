package sorted;

public class Queue {

	public static void main(String[] args) {
		int[] queue = new int [5];
		int back = 0;
		int front = 0;
		for (int i = 0; i<(queue.length); i++){
			queue[i] = (int)(Math.random()*100);
			back++;
		}
	}

}
