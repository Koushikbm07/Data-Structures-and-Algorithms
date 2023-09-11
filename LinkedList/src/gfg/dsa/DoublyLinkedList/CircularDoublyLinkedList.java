package gfg.dsa.DoublyLinkedList;


public class CircularDoublyLinkedList {

	public static void main(String[] args) {
		
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		temp2.next=head;
		head.prev=temp2;
		head=insertBegin(head, 5);
		head=insertEnd(head, 5);
		printLinkedList(head);
	}
	static void printLinkedList(Node head) {
		if(head==null) return ;
		Node cur=head;
		do {
			System.out.print(cur.data +" ");
			cur=cur.next;
		}while(cur!=head);	
	}
	static Node insertBegin(Node head,int data) {
		Node temp=new Node(data);
		if(head==null) {
			temp.next=temp;
			temp.prev=temp;
			return temp;
		}
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		return temp;
		
	}
	static Node insertEnd(Node head,int data) {
		Node temp=new Node(data);
		if(head==null) {
			temp.next=temp;
			temp.prev=temp;
			return temp;
		}
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		return head;
		
	}

}
