package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		ReverseArray.reverseArray(arr,n);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	static void reverseArray(int arr[],int  n) {
		
		int low=0,high=n-1;
		while(low<high) {
			int help=arr[high];
			arr[high]=arr[low];
			arr[low]=help;
			low++;
			high--;
		}
		
	}

}
