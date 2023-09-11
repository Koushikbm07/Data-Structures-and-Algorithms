package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int size=MoveZerosToEndOfArray.moveZeros(arr, n);
		System.out.println("Size of the array is "+size);
		System.out.println("Array Elements after moving zeros to end of an Array");
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
	
	static int moveZeros(int arr[],int n) {
		int size=0;
		for (int i = 0; i < n; i++) {
			if(arr[i]!=0) {
				int help=arr[i];
				arr[i]=arr[size];
				arr[size]=help;
				size++;
			}
		}
		return size;
	}

}
