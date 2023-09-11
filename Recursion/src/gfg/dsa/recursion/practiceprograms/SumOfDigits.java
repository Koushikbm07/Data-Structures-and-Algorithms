package gfg.dsa.recursion.practiceprograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to get sum of its digits");
		int N=scan.nextInt();
		scan.close();
		System.out.println(getSum(N));
	}
	static int getSum(int n) {
		if(n<=9)
			return n;
		return (n%10)+getSum(n/10);
	}

}
