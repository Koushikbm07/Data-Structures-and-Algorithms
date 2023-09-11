package gfg.dsa.string.practiceproblems;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to Check palindrome");
		String str=scan.nextLine();
		boolean rev=isPalindrome(str);
		if(rev) {
			System.out.println("String are Palindrome");
		}
		else {
			System.out.println("String are not Palindrome");
		}
		
		
		
		
	}
	// Using Mutable String  : StringBuilder
	static boolean  isPalindrome(StringBuilder str) {
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
		return  str.equals(rev.toString());
	}
//	using immutable String : String 
	static boolean isPalindrome(String str) {
		int left=0,right=str.length()-1;
		while(left<right){
			if (str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
			
		
	}

}
