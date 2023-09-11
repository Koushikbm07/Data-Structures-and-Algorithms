package gfg.dsa.recursion.practiceprograms;

import java.util.Scanner;

public class PrintOnetoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to print from 1 to N");
		int N=scan.nextInt();
		scan.close();
		print1toN(N);
		
	}
	static void print1toN(int n) {
		if(n==0)
			return ;
		print1toN(n-1);
		System.out.print(n+" ");
		}
	}


