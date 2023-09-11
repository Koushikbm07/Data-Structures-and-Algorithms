package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class RemoveDuplicatesInSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int size=RemoveDuplicatesInSortedArray.remove(arr,n);
		System.out.println("Array Elements after removing duplicates");
		for (int i = 0; i < arr.length; i++) {
			if(i==size) {
				break;
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Size of the array is "+size);
		

	}
	static int  remove(int arr[],int n) {
		int size=1;
		for (int i = 1; i < n; i++) {
			if(arr[i]!=arr[size-1]) {
				arr[size]=arr[i];
				size++;
			}			
		}
		return size;
	}

}
