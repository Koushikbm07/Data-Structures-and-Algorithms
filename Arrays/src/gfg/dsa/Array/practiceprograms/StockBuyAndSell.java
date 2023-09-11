package gfg.dsa.Array.practiceprograms;

import java.util.Scanner;
// Find the Maximum profit after buying and selling of stocks
public class StockBuyAndSell {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The Maximum Profit is ");
		System.out.println(findProfit(arr, n));
		
		
	}
	
	
	static int findProfit(int arr[],int n) {
		int profit=0;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		
		return profit;
		
	}

}
