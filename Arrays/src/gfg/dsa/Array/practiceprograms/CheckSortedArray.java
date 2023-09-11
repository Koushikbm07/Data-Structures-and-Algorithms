package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;

public class CheckSortedArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(isSorted(arr));
	}
	static boolean isSorted(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

}
