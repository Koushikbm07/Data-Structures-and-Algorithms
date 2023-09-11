package gfg.dsa.stack.problems;

import java.util.Scanner;
import java.util.Stack;


public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String of Parenthesis only '(){}[]'");
		String str = scan.next();
		boolean res=isBalanced(str);
		if(res) {
			System.out.println("The String is Balanced");
		}
		else {
			System.out.println("The String is Not Balanced");

		}
		

	}
	static boolean isBalanced(String str) {
		Stack stack=new Stack();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.empty()) {
					return false;
				}
				if(matching((char)stack.peek(),c)) {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		return (stack.isEmpty());
		
	}
	static boolean matching(char a , char b) {
		return ((a=='(' && b==')')|| 
				(a=='{' && b=='}') ||
				(a=='[' && b==']') );
	}

}
