package gfg.dsa.recursion.practiceprograms;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to find sum of Natural Numbers");
		int n=scan.nextInt();
		scan.close();
		System.out.println(sumOfNaturalNumber(n));
	}
	static int sumOfNaturalNumber(int n) {
		if(n==1)
			return 1;
		return n+sumOfNaturalNumber(n-1);
	}

}
