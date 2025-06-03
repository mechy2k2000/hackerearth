import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt();
        int h = sc.nextInt();
        
        
        try {
            if(b <1 || h < 1)
                throw new Exception("Breadth and height must be positive");
                
            System.out.println(b*h);
        } catch(Exception e) {
            System.out.println(e);
        }
        
        
        
    }
}
