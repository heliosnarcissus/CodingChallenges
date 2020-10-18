package com.java.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InfiniteA {

	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 *  Lilah has a string of lowercase English letters that she repeated infinitely many times.

		Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.		
		For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.		
		
		-Function Description-	
		Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length 
		in the infinitely repeating string.
		
		repeatedString has the following parameter(s):
		
		s: a string to repeat
		n: the number of characters to consider
		
		-Input Format-
		
		The first line contains a single string, .
		The second line contains an integer, .
		
		-Output Format-
		
		Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.
		
		-Sample Input:
		aba
		10
		-Sample Output:	
		7
	 	**/
	public static void main(String[] args) {
		
		String s = scanner.nextLine();	
		long lng = scanner.nextLong(); 
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		Long result = countA(s, lng);
		System.out.println(result);
		scanner.close();
				
	}
	public static long countA(String str, Long num) {
		 if(str.equals("") || num< 1) System.exit(-1);
		 if(num > Long.MAX_VALUE)  System.exit(-2);
	     if(str.equals("a")) return num;

	        long remainder = num %   str.length();
	        Long answer =  counter(str) * (num%str.length())+Long.valueOf(counter( str.substring(0, (int) remainder )));      
	        return answer;
	}  
	
	public static long counter(String str) {
		Integer occurences = 0;
		List<String> letterArray =  Arrays.asList( str.split("") );
		System.out.println( letterArray.size() + "| "+str);
		for(String s : letterArray ) {
			if(s.equals("a")) {
				occurences++;
			}	
		}	
		return occurences;
	}
}
