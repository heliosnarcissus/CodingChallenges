package com.java.solutions;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] words = {"flavonoid","flavor", "flap"};
		System.out.println( words[0].indexOf("flavonoid") );
		System.out.println( longestCommonP(words) );
	}

	public static String longestCommonP(String[] strs) {
		if( strs.length == 0 ) return "";
		
		String prefix = strs[0];
		
		for(int i = 1 ; i < strs.length; i++) {
			 System.out.println("strs[i].indexOf(prefix): " + strs[i].indexOf(prefix));
			 
			 while( strs[i].indexOf(prefix) != 0) {
				 System.out.println(prefix);
				 prefix = prefix.substring(0, prefix.length()-1);
			 }
		}
		return prefix;
	}
}
