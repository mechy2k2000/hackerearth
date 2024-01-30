import java.util.Scanner;

// Input (stdin)

//     java 100

//     cpp 65

//     python 50

// Your Output (stdout)

//     ================================

//     java           100

//     cpp            065

//     python         050

//     ================================


public class formatprint {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
                String s1=sc.next();
                int x=sc.nextInt();
                String s2=sc.next();
                int y=sc.nextInt();
                String s3=sc.next();
                int z = Integer.valueOf(sc.next());
                
                
                
                System.out.println(String.format("%-15s%03d",s1, x));
                System.out.println(String.format("%-15s%03d",s2, y));
                System.out.println(String.format("%-15s%03d",s3, z));
                
            
            System.out.println("================================");
            sc.close();
    }
}


