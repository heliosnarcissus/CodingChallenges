package com.java.solutions;

import java.util.Arrays;

public class ElectronicShop {

	public static void main(String[] args) {
		int purchasingMoney = 60;
		int[] kboard = {40,50,60};
		int[] usbdrives = {5,8,12};
		System.out.println( smallestChange(purchasingMoney, kboard, usbdrives) );
	}
	public static int smallestChange(int budget, int[] keyboards, int[] usbs) {	
		Arrays.sort(keyboards);
	    Arrays.sort(usbs);
		int max = 0;
		int sum = 0;
		for(int i=keyboards.length-1; i>=0; i--) {
				for(int j=usbs.length-1 ; j >=0; j--) {
					sum = keyboards[i] + usbs[j];
					if(sum > max && sum <= budget ) {
						max = sum;
					}
				}
		}
		if(max == 0) return -1;
		return max;
	}
}
