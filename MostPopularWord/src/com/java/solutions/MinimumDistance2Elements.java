package com.java.solutions;

import java.util.Arrays;

public class MinimumDistance2Elements {
	public static void main(String[] args) {
		int[] sortThis = {8,24,3,20,1,17};	
		System.out.print( minDistance(sortThis));
	}
	
	public static int minDistance(int[] arr) {
		if(arr.length < 2) return arr[0];
		if(arr.length == 0) return -1;
		
		Arrays.sort(arr);
		
		return arr[1] - arr[0];
	}
}
