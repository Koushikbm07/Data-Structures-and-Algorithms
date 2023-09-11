package gfg.dsa.linkedlist.problems;

import java.util.Scanner;

import gfg.dsa.singlylinkedlist.Node;
import gfg.dsa.singlylinkedlist.SinglyLinkedList;

//Given A Sorted Singly LinkedList.
/* Write a method which accepts a data to be inserted in sorted order 
in given linked list and returns the head node of the linked list */
public class SortedLinkedList {

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
		 System.out.println("Enter a element to add in the linked list ");
		 int ele=scan.nextInt();
		 System.out.print("After adding a element : ");
		 printLinkedList(head);
		 System.out.print("After adding a element : ");
		 head=sortedInsert(head, ele);
		 printLinkedList(head);
			
	}
	
	static Node sortedInsert(Node head,int data) {
		Node temp=new Node(data);
		if(head==null) return temp;
		if(data < head.data) {
			temp.next=head;
			return temp;
		}
		
		Node cur=head;
		while(cur.next!=null && cur.next.data< data) {
			cur=cur.next;
		}
		temp.next=cur.next;
		cur.next=temp;
		return head;
		
	}
//	Prints the LinkeList
	static void printLinkedList(Node head) {
		while(head!=null) {
			System.out.print(head.data +" ");
			head=head.next;
		}
	}
}
