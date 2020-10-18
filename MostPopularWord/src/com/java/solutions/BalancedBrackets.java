package com.java.solutions;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String goodCase = "{[()]}";
		String badCase = "{[({{)]}";
		System.out.println( isBalanced(badCase) );
	}
	public static boolean isBalanced(String str) {
		Stack <Character> stack = new Stack<>();
		Character popValue;
		boolean isBalanced = false;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if( str.charAt(i) == '{' ||
				str.charAt(i) == '[' ||	
				str.charAt(i) == '(' ) {
					
				stack.push(str.charAt(i) );
			}else {
					if(stack.isEmpty()) return false;
					popValue = stack.pop();
					if( popValue == '{' && str.charAt(i) != '}' ) {
						return false;
					}else if( popValue == '[' && str.charAt(i) != ']'){
						return false;
					}else if( popValue == '(' && str.charAt(i) != ')'){
						return false;
					}
							
				}
		}
	   isBalanced = stack.isEmpty() ? true : false;
		return isBalanced;
	}
}
