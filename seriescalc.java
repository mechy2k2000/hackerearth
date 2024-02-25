package org.example;

import java.util.*;
import java.io.*;
import java.math.*;

//We use the integers a,b , and n to create the following series:
//(a + 2^0 * b),(a+ 2^0 * b + 2^1 * b),.....,(a+ 2^0 * b + 2^1 * b + ... + 2^n-1 * b)
//You are given q queries in the form of a, b, and n. For each query, print
// the series corresponding to the given , , and values as a single line of
// space-separated integers.
//
//Input Format
//The first line contains an integer,
//, denoting the number of queries.
//Each line of the subsequent lines contains three space-separated integers describing the respective a_i, b_i, and n_i
//values for that query.
//
//Constraints
// 0 < q < 500
// 0 <= a,b <= 50
// 1 <= n <= 15
//Output Format
//
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of
// n space-separated integers.
//


class seriescalc {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Map<String, Integer>> listOfMaps = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            Map<String, Integer> mapValues = new HashMap<>();
            mapValues.put("a", a);
            mapValues.put("b", b);
            mapValues.put("n", n);
            listOfMaps.add(mapValues);
        }
        in.close();

        //System.out.println(listOfMaps);

        for (Map<String, Integer> map : listOfMaps) {
            // System.out.println(map);
            int results = map.get("a");
            for (int i = 0; i < map.get("n"); i++) {

                results = results + (int) Math.pow(2, i) * map.get("b");
                System.out.print(results + " ");
            }
            System.out.println("");

        }
    }
}
