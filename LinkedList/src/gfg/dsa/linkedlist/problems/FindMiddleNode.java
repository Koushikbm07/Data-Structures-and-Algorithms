package gfg.dsa.linkedlist.problems;

import java.util.Scanner;

import gfg.dsa.singlylinkedlist.Node;

public class FindMiddleNode {

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
		 int middleNode=middleNode(head );
		 System.out.println("The Middle Number of Linked List is  : "+middleNode);
	}
	static int middleNode(Node head) {
		if(head==null) return -1;
		if(head.next==null) return head.data;
		Node slow=head,fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data; 
	}
}
