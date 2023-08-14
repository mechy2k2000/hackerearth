
import java.math.BigInteger;
import java.util.*;



//Hacker Earth Favorite Singer problem
//Java 8

public class favsinger {
    public static void main(String args[]) throws Exception {


        Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter how many songs: ");
        int songCount = sc.nextInt();
        sc.nextLine();
        //System.out.println("Song Count: " + songCount);
        //System.out.println("\nPlease enter songs");
        String songInput = sc.nextLine();
        //System.out.println("Songs: " + songInput);
        int songInputLength = songInput.length() ;
        sc.close();

        String[] songArray = songInput.split("\\s+");
        HashMap<BigInteger, Integer> singerCount = new HashMap<BigInteger,Integer>();

        Arrays.stream(songArray).forEach( item -> {
            BigInteger s = new BigInteger(item);
            if(singerCount.containsKey(s)) {
                singerCount.put(s, singerCount.get(s)+1);
            } else {
                singerCount.put(s, 1);
            }
        });

        if(songCount != songArray.length) {
            throw new Exception("Expected song count mismatch");

        }

        BigInteger topSinger = new BigInteger("0");
        Integer topSingerCount = 0;

        HashMap<BigInteger, Integer> favSingers = new HashMap<BigInteger, Integer>();

        for (Map.Entry<BigInteger,Integer> entry : singerCount.entrySet()) {
            if(topSingerCount.compareTo(entry.getValue()) == -1)  {
                topSinger = entry.getKey();
                topSingerCount = entry.getValue();
                favSingers.clear();
                favSingers.put(entry.getKey(),entry.getValue());
            } else if (topSingerCount.compareTo(entry.getValue()) == 0) {
                    favSingers.put(entry.getKey(), entry.getValue());

            }
        }

        //System.out.println(songArray);
        //System.out.println(singerCount);
        //System.out.println(topSinger);
        //System.out.println(favSingers);
        System.out.println(favSingers.size());
    }
}
