package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class LeadersInAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The Leader of the Array are   " );
		findLeaders(arr);
		
	}
	static void findLeaders(int arr[]) {
		int n=arr.length;
		int leader=arr[n-1];
		System.out.print(leader+" ");
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=leader) {
				leader=arr[i];
				System.out.print(leader+" ");
			}
		}
		
		
	}

}
