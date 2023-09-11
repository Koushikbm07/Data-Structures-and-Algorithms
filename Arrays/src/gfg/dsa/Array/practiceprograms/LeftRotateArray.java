package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter how many times the array should be rotated ");
		int d=scan.nextInt();
		rotateLeft(arr,d);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	static void rotateLeft(int arr[],int d) {
		int n=arr.length;
		int temp[]=new int[n];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
		
	}

}
