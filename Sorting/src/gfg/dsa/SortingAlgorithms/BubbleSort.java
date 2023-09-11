package gfg.dsa.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements in Unsorted Way");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		bubbleSort(arr, n);
		System.out.println("The Array Elements are ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	static void bubbleSort(int arr[], int n) {
		
		for(int i=0;i<=n-2;i++) {
			for(int j=0;j<=n-i-2;j++) {
				if(arr[j]>arr[j+1]) {
					int help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
		
	}
}
