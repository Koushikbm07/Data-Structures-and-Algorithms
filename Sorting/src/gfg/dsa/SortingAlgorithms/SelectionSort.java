package gfg.dsa.SortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements in Unsorted Way");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		SelectionSort(arr, n);
		System.out.println("The Array Elements are ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	static void SelectionSort(int arr[],int n) {
		
		for(int i=0;i<=n-2;i++) {
			int minIndex=i;
			
			for(int j=i+1;j<=n-1;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int help=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=help;
		}
	}

}
