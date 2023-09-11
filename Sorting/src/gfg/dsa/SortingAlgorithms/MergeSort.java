package gfg.dsa.SortingAlgorithms;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements in Unsorted Way");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		mergeSort(arr,0, n-1);
		System.out.println("The Array Elements are ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	static void mergeSort(int arr[],int l,int h) {
		if(h>l) {
			int mid=l+(h-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	static void merge(int arr[],int low,int mid,int  high) {
		int m=mid-low+1;
		int n=high-mid;
		int k;
		int left[]= new int[m] ;
		int right[]=new int[n];
		for( k=0;k<m;k++) {
			left[k]=arr[low+k];
		}
		for( k=0;k<n;k++) {
			right[k]=arr[mid+1+k];
		}
		
		int i=0,j=0;
		k=low;
		while(i<m && j<n) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
				
			}
			else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<m) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n) {
			arr[k]=right[j];
			j++;
			k++;
		}
	}

}
