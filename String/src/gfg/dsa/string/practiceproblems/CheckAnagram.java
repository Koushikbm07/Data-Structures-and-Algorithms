package gfg.dsa.string.practiceproblems;

import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String S1");
		String s1=scan.next();
		System.out.println("Enter String S2");
		String s2=scan.next();
		CheckAnagram checkAnagram = new CheckAnagram();
		boolean res = checkAnagram.areAnagram(s1, s2);
		if(res) {
			System.out.println("Strings Are Anagram");
		}
		else {
			System.out.println("Strings Are Not Anagram");

		}
	}
	boolean areAnagram(String s1, String s2) {
		final int CHAR=256;
		char count[]= new char[CHAR];
		if(s1.length()!=s2.length()) return false;
		for(int i=0;i< s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int j=0; j<CHAR ;j++) {
			if(count[j]!=0) {
				return false;
			}
		}
		
		return true;
	}
}
