package gfg.dsa.singlylinkedlist;


public class CircularSinglyLinkedList {

	public static void main(String[] args) {
		Node head=new Node(10);
		 head.next=new Node(20);
		 head.next.next=new Node(30);
		 head.next.next.next=new Node(40);
		 head.next.next.next.next=head;
//		 head=insertBegin(head, 5);
//		 head=insertEnd(head, 5);
//		 head=insertEnd(head, 5);
		 head=delete(head, 2);
		 printLinkedList(head);
	}
//	Traverse the Circular LinkedList and prints the data of each Node 
	static void printLinkedList(Node head) {
		if(head==null) return ;
		Node cur=head;
		do {
			System.out.print(cur.data +" ");
			cur=cur.next;
		}while(cur!=head);	
	}
//	Method to Insert at the Head of Circular LinkedList
	static Node insertBegin(Node head,int data) {
		Node temp=new Node(data);
		if (head==null ) {
			temp.next=temp;
			
		}
		temp.next=head.next;
		head.next=temp;
		int help=head.data;
		head.data=temp.data;
		temp.data=help;
		return head;
	}
//	Method to insert a Node at End of Circular LinkedList
	static Node insertEnd(Node head,int data) {
		Node temp=new Node(data);
		if (head==null ) {
			temp.next=temp;
			
		}
		temp.next=head.next;
		head.next=temp;
		int help=head.data;
		head.data=temp.data;
		temp.data=help;
		return temp;
		
	}
//	Method to delete Head of the Circular LinkedList
	static Node deleteFirst(Node head) {
		if(head==null || head.next==head) return null;
		head.data=head.next.data;
		head.next=head.next.next;
		return head;
	}
//	Method to delete Kth position in Circular LinkedList
	static Node delete(Node head,int pos) {
		if(head==null || head.next==head) return null;
		Node cur=head;
		for(int i=1;i<pos-1;i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
		return head;
	}
}
