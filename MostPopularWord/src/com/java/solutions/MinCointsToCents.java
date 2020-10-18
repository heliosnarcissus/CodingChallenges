package com.java.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinCointsToCents {
	static int  ctr = 0;
	static int answer = 0;
	static int currentCoin = 0;
	static List<Integer> centTypes = Arrays.asList(25,10,5,1);
	
	public static void main(String[] args) {
		/** PROBLEM TO BE SOLVED
		 * Find the minimum number of coins required to make n cents.
		 * You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
		 * For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.
		 **/
		int cents = 21;
		
		System.out.println("minimum no. of Coins to breakdown "+ cents+ " cent(s) is "+ returnCoins(cents, centTypes));
	} 
	public static Integer returnCoins(Integer N, List<Integer> divisorCoinsList) {
		if( N <= 0) return -1;	 
		if(ctr < divisorCoinsList.size()) {	
			currentCoin = divisorCoinsList.get(ctr);	
			if( (N / currentCoin) > 0 ) {
				answer = answer + (N / currentCoin);
				ctr++;
				//if  no remainders left, meaning no more to process..return the answer.
				if( N % divisorCoinsList.get(ctr-1) == 0) {
					return answer;
				}else {
					returnCoins(N % divisorCoinsList.get(ctr-1), divisorCoinsList);
				}
			}
			ctr++;
			returnCoins(N,divisorCoinsList);
		}
		return answer;
	}
}
/**
 * NOTES:
 * 
 * 1. "ctr" is used to track the current denomination, w/c we're using to divide N.
 * 
 * 2. (N / currentCoin) > 0 )
 * 	  if the quotient is negative, that means N is lesser than the denomination you're using as a divisor.
 * 	  e.g.: N = 5¢, divisor = 25¢ .
 * 	  if the quotient is positive, that means the divisor is less than N.
 * 	  e.g.: N = 15¢, divisor = 5¢ .
 * 
 * 3. 
 * 
 * 
 * **/




