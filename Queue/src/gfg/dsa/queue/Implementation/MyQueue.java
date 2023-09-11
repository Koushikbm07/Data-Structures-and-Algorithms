package gfg.dsa.queue.Implementation;

public class MyQueue {
	private int front;
	private int rear;
	private int size;
	private int cap;
	private int[] arr;
	
	MyQueue(int cap){
		this.cap=cap;
		arr=new int[cap];
		size=0;
		front=0;
		rear=-1;
	}
	
	void enqueue(int data) {
		if(rear==cap-1) {
			System.out.println("The Queue is Full");
			return ;
		}
		arr[++rear]=data;
		size++;
	}
	void dequeue() {
		size--;
		for(int i=0;i<=size-2;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
	}
	int getFront() {
		return arr[front];
	}
	int getRear() {
		return arr[rear];
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	boolean isFull() {
		return size==cap;
	}
	
	
}
