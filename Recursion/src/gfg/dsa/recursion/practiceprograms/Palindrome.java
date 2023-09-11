package gfg.dsa.recursion.practiceprograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abbcdbba", 0,5));
	}
	static boolean isPalindrome(String str,int start ,int end) {
		if(start>=end)
			return true;  
		
		return str.charAt(start)==str.charAt(end) && isPalindrome(str, start+1, end-1) ;
		
	}

}
