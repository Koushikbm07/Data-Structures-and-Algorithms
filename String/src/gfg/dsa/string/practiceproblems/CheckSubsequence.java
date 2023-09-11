package gfg.dsa.string.practiceproblems;

import java.util.Scanner;

public class CheckSubsequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String S1");
		String s1=scan.next();
		System.out.println("Enter String S2");
		String s2=scan.next();
		CheckSubsequence checkSubsequence = new CheckSubsequence();
		boolean res=checkSubsequence.isSubsequence(s1, s2);
		if(res) {
			System.out.println(s2+" is Subsequence of "+s1);
		}
		else {
			System.out.println(s2+" is Not Subsequence of "+s1);
		}
	}

	boolean isSubsequence(String s1, String s2) {
		int m=s1.length();
		int n=s2.length();
		
		int j=0;
		for(int i=0;i<m && j<n;i++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
			}
		}
		return (j==n);
	}
}
