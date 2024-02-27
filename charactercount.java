import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class helloworld {
    public static void main(String[] args) {
       String largeString = "anbnmbnmbnambababaaaaaakkklmmnnnbbbb";

       StringBuilder largeSB = new StringBuilder(largeString);
       char[] largeArray = largeString.toCharArray();
       System.out.println(largeArray);
        System.out.println("Char count");

        HashMap<Object, Long> charCount = new HashMap<Object, Long>();
        largeString.chars().forEach(ch -> charCount.put((char) ch , largeString.chars().filter(h -> h == ch ).count()));
        System.out.println(charCount);

        largeString.chars().distinct().forEach(ch -> System.out.println((char) ch + " : " + largeString.chars().filter(h -> h == ch).count()));
    }
}
//Output
//anbnmbnmbnambababaaaaaakkklmmnnnbbbb
//Char count
//{a=10, b=10, k=3, l=1, m=5, n=7}
//a : 10
//n : 7
//b : 10
//m : 5
//k : 3
//l : 1
// more stuff
