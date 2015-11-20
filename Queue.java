package sorted;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int s){
		maxSize=s;
		queueArray=new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public void insert(long j){
		String result = rear == maxSize -1 ? "Queue full" : addItem(j);
		System.out.println(result);
	}
	public String addItem(long j){
		queueArray[++rear]=j;
		nItems++;
		return "Item added";
	}
	public voide remove(){
		string result = rear ==-1 "te
	}
}
