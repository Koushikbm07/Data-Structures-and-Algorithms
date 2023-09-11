package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class MaximumDifference {
//Question :
//	Find the Maximum Difference between arr[j]-arr[i] such that j>i
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The Maximum Difference in an Array is ");
		System.out.println(findMaxDifference(arr));
		
	}
	static int findMaxDifference(int arr[]) {
		int maxDiff=arr[1]-arr[0];
		int minValue=arr[0];
		int n=arr.length;
		
		for(int j=1;j<n;j++) {
			maxDiff=Math.max(maxDiff, arr[j]-minValue);
			minValue=Math.min(minValue, arr[j]);
		}
	return maxDiff;
	}

}
