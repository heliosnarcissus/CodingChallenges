package com.java.solutions;

import java.util.Scanner;

public class JumpingOnClouds {
	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] c = new int[n];

	        String[] cItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            c[i] = cItem;
	        }
	        int result = jumpingOnClouds(c,n);
	        System.out.println(result);
	}

	static int jumpingOnClouds(int[] c, int n) {
        int ctr = 0;
        for(int i = 0 ; i < c.length ; i++){
            if( (i+2) <= (c.length-1) && c[i+2] != 1 ){
            	 System.out.println("i +2 " + i);
            	  i++;
                  ctr++;
            }else{
                 ctr++;
            	 System.out.println("i++ " + i);
            }
        }
        return ctr - 1;
    }
}
