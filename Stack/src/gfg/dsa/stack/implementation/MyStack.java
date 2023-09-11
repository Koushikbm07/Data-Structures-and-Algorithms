package gfg.dsa.stack.implementation;

public class MyStack {
	int arr[];
	int cap;
	int size;
	int top=-1;
	
	MyStack(int cap){
		this.cap=cap;
		size=0;
		arr=new int[cap];
	}
	void push(int ele) {
		if(top==cap-1) {
			System.out.println("The Stack is Full");
			return ;
		}
		top++;
		arr[top]=ele;
		size++;
	}
	int pop() {
		if(top==-1) {
			System.out.println("The Stack is Empty");
			return Integer.MAX_VALUE;
			
		}
		else {
			size--;
			return arr[top--];
		}
	
	}
	boolean isEmpty() {
		return top==-1;
	}
	int peek() {
		if(top==-1) {
			System.out.println("The Stack is Empty");
			return Integer.MAX_VALUE;
		}
		return arr[top];
	}
	int size() {
		return size;
	}
}
