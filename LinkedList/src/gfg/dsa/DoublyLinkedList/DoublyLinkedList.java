package gfg.dsa.DoublyLinkedList;

 class DoublyLinkedList {

	public static void main(String[] args) {
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		printLinkedList(head);
		
		System.out.println();
		printLinkedList(head);
		System.out.println();
//		Reverse of Linked List
//		head=reverseLinkedList(head);
	
		head=deleteFirst(head);
		printLinkedList(head);
	}
	static void printLinkedList(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	static void printReverseLinkedList(Node head) {
		Node cur=head;
		while(cur.prev!=null) {
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	static Node insertBegin(Node head, int data) {
		Node temp=new Node(data);
		temp.next=head;
		if(head!=null)
			head.prev=temp;
		
		return temp;
	}
	static Node insertEnd(Node head,int data) {
		Node temp=new Node(data);
		if(head==null )return temp;
		Node cur=head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next=temp;
		temp.prev=cur;
		
		return head;
	}
	static Node reverseLinkedList(Node head) {
		if(head==null || head.next==null) return head;
		Node cur=head;
		Node prev=null;
		
		while(cur!=null) {
			prev=cur.prev;
			cur.prev=cur.next;
			cur.next=prev;
			cur=cur.prev;
		}
		return prev.prev;
	}
// Delete head of Doubly Linked List
	static Node deleteFirst(Node head) {
		if(head==null || head.next==null) return null;
		head=head.next;
		head.prev=null;
		return head;
		
	}
// Delete Last Node of Doubly Linked List
	static Node deleteLast(Node head) {
		if(head==null || head.next==null) return null;
		Node cur=head;
		while(cur.next.next!=null) {
			cur=cur.next;
		}
		cur.next=null;
		return head;
		
	}
}
