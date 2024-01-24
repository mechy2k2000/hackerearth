

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Given an integer N , perform the following conditional actions:
// If N is odd, print Weird
//If N is even and in the inclusive range of 2 to 5 print Not Weird
//If N is even and in the inclusive range of 6 to 20 print Weird
//If N is even and greater than 20 print Not Weird
//
// Input Format
//A single line containing a positive integer N
//
//Constraints
// 1 <= N <= 100
//
//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.Given an integer,
//
public class weird {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N < 1 || N > 100)
            System.exit(0);

        if(N % 2 != 0) {
            System.out.println("Weird");
            System.exit(0);
        }

        if(N >=2 && N <=5) {
            System.out.println("Not Weird");
            System.exit(0);
        }

        if(N >= 6 && N <= 20) {
            System.out.println("Weird");
            System.exit(0);
        }
        
        if(N % 2 == 0 && N> 20) {
            System.out.println("Not Weird");
            System.exit(0);
        }


    }
}
