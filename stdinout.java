import java.util.*;

//hacker earth solution

public class stdinout {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int firstLine = sc.nextInt();
        sc.nextLine();
        
        if(firstLine <0 || firstLine>10)
            throw new Exception("first input must be a number between or equal to 0 and 10!");
        
        String secondLine = sc.nextLine();
        sc.close();
        if(secondLine.length() <1 || secondLine.length() > 15)
            throw new Exception("second input must by 1 to 15 characters");
        
        System.out.println(firstLine*2);
        System.out.println(secondLine);

        
        
    }
}
