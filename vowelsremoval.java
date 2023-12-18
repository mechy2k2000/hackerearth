
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class vowelsremoval {

/*
    input a number "n"
    input a string "input"

    output a string where all vowels, commas, and periods are removed

    rules
    first and last characters cannot be whitespace,
    valid characters can be lowercase or uppercase, commas (,), or period (.)
 */

    public static String removeVowels(int stringLength, String inputString) {
        ArrayList<String> arrChar = new ArrayList<String>();

        List<String> removeCharList = Arrays.asList(new String[]{"a","i","e","u","o","A","E","I","U","O",",","."});

        StringBuffer inputBuff = new StringBuffer(inputString);
        StringBuffer resultBuff = new StringBuffer();
        for(int i=0; i < stringLength; i++) {
            if(i==0 && String.valueOf(inputBuff.charAt(i)).equals(" "))
                continue;

            if(!removeCharList.contains(Character.toString(inputBuff.charAt(i))))
                resultBuff.append(inputBuff.charAt(i));

            if(i==stringLength && String.valueOf(inputBuff.charAt(i)).equals(" "))
                continue;
        }

        return resultBuff.toString();

    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        System.out.println(n);
        System.out.println(input);

        System.out.println(removeVowels(n, input));



    }

}
