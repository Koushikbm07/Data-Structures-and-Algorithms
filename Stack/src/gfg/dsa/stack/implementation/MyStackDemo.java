package gfg.dsa.stack.implementation;

public class MyStackDemo {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println(myStack.peek());
		System.out.println(myStack.size());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());		
		System.out.println(myStack.pop());		
		System.out.println(myStack.pop());		
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.peek());
		System.out.println(myStack.size());
	}

}
