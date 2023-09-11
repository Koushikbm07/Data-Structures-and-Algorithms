package gfg.dsa.SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements in Unsorted Way");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		InsertionSort(arr, n);
		System.out.println("The Array Elements are ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	static void InsertionSort(int arr[],int n) {
		
		for(int i=1;i<n;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}

}
