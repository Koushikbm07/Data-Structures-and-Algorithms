package gfg.dsa.string.practiceproblems;

import java.util.Scanner;
// Prints the index of String str if the String contains given Pattern
public class CheckPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String str=scan.nextLine();
		System.out.println("Enter pattern String ");
		String pat=scan.nextLine();
		patternPrint(str,pat);
		
	}
	static void patternPrint(String str,String pat) {
		int m=str.length();
		int n=pat.length();
		for(int i=0;i<=m-n;i++) {
			int j;
			for(j=0;j<n;j++) {
				if(pat.charAt(j)!=str.charAt(i+j)) {
					break;
				}
			}
			if(j==n) {
				System.out.print(i+" ");
			}
		}
	}
}
