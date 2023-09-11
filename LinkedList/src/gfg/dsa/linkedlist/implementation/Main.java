package gfg.dsa.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		Node head=new Node(10);
		 head.next=new Node(20);
		 head.next.next=new Node(30);
		
		while(head!=null) {
		System.out.println(head.data);
		head=head.next;
	}

}
}
