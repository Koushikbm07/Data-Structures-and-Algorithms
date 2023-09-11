package gfg.dsa.singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of elements you want to enter ");
		int len=scan.nextInt();
		System.out.println("Enter the elements ");
		
		Node head=new Node(0);
		Node cur=head;
		for(int i=0;i<len;i++) {
			int ele=scan.nextInt();
			Node temp=new Node(ele);
			cur.next=temp;
			cur=cur.next;
			
		}
		 head=head.next;
		 System.out.print("The Elements are : ");
		 printLinkedList(head);
		
		 
		
	}
// Prints the Elements in the LinkedList
	static void printLinkedList(Node head) {
		while(head!=null) {
			System.out.print(head.data +" ");
			head=head.next;
		}
	}
//	Insert the Given Node at Beginning of LinkedList
	static Node insertBegin(Node head,int data) {
		Node temp=new Node(data);
		temp.next=head;
		return temp;
	}

//	inserts  the Given Node at End of LinkedList 
	static Node insertEnd(Node head,int data) {
		Node temp = new Node(data);
		if(head==null) return temp;
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp; 
		return head;
	}

//	Delete the First Node of LinkedList 
	static Node deleteFirst(Node head) {
		return head.next;
	}
//	Delete the Last Node of LinkedList 
	static Node deleteLast(Node head) {
		if(head==null || head.next==null) return null;
		Node cur=head;
		while(cur.next.next!=null) {
			cur=cur.next;
		}
		cur.next=null;
		return head;
	}
//Find the position of Particular Node in the LinkedList
	static int search(Node head,int key) {
		int pos=1;
		Node cur=head;
		while(cur.data!=key) {
			cur=cur.next;
			pos++;
		}
		return pos;
	}
//Insert a Element at Particular position 
	static Node insert(Node head,int data , int pos) {
		Node temp=new Node(data);
		if(pos==1) {
			temp.next=head;
			return temp;
		}
		Node cur=head;
		for(int i=1;i<pos-1;i++) {
			cur=cur.next;
		}
		if(cur==null) {
			return head;
		}
		temp.next=cur.next;
		cur.next=temp;
		return head;
	}
}
