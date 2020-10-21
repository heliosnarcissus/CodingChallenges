package com.java.solutions;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CatAndMouse {
	    static String catAndMouse(int x, int y, int z) {
	        if( x  < 0 || y < 0 || z < 0) return "error";
	        if( Math.abs(z-x) > (Math.abs(z-y)) ){
	            return "Cat B";
	        }else if( Math.abs(z-x) < (Math.abs(z-y)) ){
	            return "Cat A";
	        }else if( Math.abs(z-x) == (Math.abs(z-y)) ){
	            return "Mouse C";
	        }
	        return "error";
	    }
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String[] xyz = scanner.nextLine().split(" ");

	            int x = Integer.parseInt(xyz[0]);

	            int y = Integer.parseInt(xyz[1]);

	            int z = Integer.parseInt(xyz[2]);

	            String result = catAndMouse(x, y, z);

	            bufferedWriter.write(result);
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
}
/*
Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given  queries in the form of , , and  representing the respective positions for cats  and , and for mouse . Complete the function  to return the appropriate answer to each query, which will be printed on a new line.

If cat  catches the mouse first, print Cat A.
If cat  catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
--------------------------------------------------------------------------------------------------------------
Example

The cats are at positions  (Cat A) and  (Cat B), and the mouse is at position . Cat B, at position  will arrive first since it is only  unit away while the other is  units away. Return 'Cat B'.

Function Description

Complete the catAndMouse function in the editor below.

catAndMouse has the following parameter(s):

int x: Cat 's position
int y: Cat 's position
int z: Mouse 's position
Returns

string: Either 'Cat A', 'Cat B', or 'Mouse C'
Input Format

The first line contains a single integer, , denoting the number of queries.
Each of the  subsequent lines contains three space-separated integers describing the respective values of  (cat 's location),  (cat 's location), and  (mouse 's location).

Constraints

Sample Input 0

2
1 2 3
1 3 2
Sample Output 0

Cat B
Mouse C
*/
