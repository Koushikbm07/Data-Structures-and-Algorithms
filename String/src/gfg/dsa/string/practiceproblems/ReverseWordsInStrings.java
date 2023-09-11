package gfg.dsa.string.practiceproblems;

import java.util.Scanner;

public class ReverseWordsInStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String S1");
		StringBuilder str=new StringBuilder(scan.nextLine());
//		String str=new String(scan.nextLine());
		ReverseWordsInStrings reverseWordsInStrings = new ReverseWordsInStrings();
		String reverse=reverseWordsInStrings.reverseWords(str);
		System.out.println(reverse);
	}
//	Reverse String by words using Mutable String 
	String reverseWords(StringBuilder str) {
		int start=0;
		String rev="";
		for(int end=0;end<str.length();end++) {
			if(str.charAt(end)==' ') {
				rev=" "+str.substring(start,end)+rev;
				start=end+1;
			}
		}
		rev=str.substring(start,str.length())+rev;
		return rev;
	}
//	Reverse String by words using Immutable String 
	String reverseWords(String str) {
		String ch[]=str.split(" ");
		String rev="";
		for (String word : ch) {
			rev=" "+word+rev;
		}
		rev=rev.substring(1);
		return rev;
	}

}
