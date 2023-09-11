package gfg.dsa.queue.Implementation;

public class LinkedListQueue {
	Node front,rear;
	int size;
	public LinkedListQueue() {
		front=null;
		rear=null;
		size=0;
		
	}
	void enqueue(int data) {
		if(front==null) return ;
		Node temp=new Node(data);
		rear.next=temp;
		rear=temp;
		size++;
	
	}
	void dequeue() {
		if(front==null) return ;
		front=front.next;
		if(front==null) {
			rear=null;}
		size--;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return front==null;
	}
	
}
