package gfg.dsa.queue.Implementation;

public class CircularQueue {
	private int front;

	private int size;
	private int cap;
	private int[] arr;
	
	CircularQueue(int cap){
		this.cap=cap;
		arr=new int[cap];
		size=0;
		front=0;
	
	}
//	to add the data in the Circular Queue
	void enqueue(int data) {
		if(size==cap) {
			System.out.println("The Queue is Full");
			return;
		}
		int rear=getRear();
		rear=(rear+1)%cap;
		arr[rear]=data;
		size++;
	}
//	To get remove and get first element of Circular Queue
	int  dequeue() {
		if(size==0) {
			System.out.println("The Queue is Empty");
			return -1;
		}
		int res=arr[front];
		front=(front+1)%cap;
		size--;
		return res;
	}
//	Returns the front index of the Circular Queue
	int getFront() {
		if(size==0) {
			return -1;
		}
		return front;
	}
//	Returns the Rear index of the Circular Queue

	int getRear() {
		if(size==0) {
			return -1;
		}
		return (front+size-1)%cap;
	}
	//	Returns the Number of elements in the Circular Queue

	int size() {
		return size;
	}
//	Checks if the Circular Queue is Empty or not
	boolean isEmpty() {
		return size==0;
	}
//	Checks if the Circular Queue is Full or not
	boolean isFull() {
		return size==cap;
	}
	
}
