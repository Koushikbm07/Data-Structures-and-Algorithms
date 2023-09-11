package gfg.dsa.recursion.practiceprograms;

import java.util.Scanner;

public class PrintNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to print from N to 1");
		int N=scan.nextInt();
		scan.close();
		printNto1(N);
	
	
	}
	static void printNto1(int n) {
		if(n==0)
			return ;
		System.out.print(n+" ");
		printNto1(n-1);
	}

}
