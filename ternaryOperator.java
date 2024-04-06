public class ternaryOperator {

    public static void main(String[] args) {
        String value = "yes";

        System.out.println(value != null ? "it is not null" : value);
        String testPrefix = "test_";
        String sampleString1 = "test_superman";
        String sampleString2 = "batman";
        System.out.println(sampleString1.substring(0,5).equals(testPrefix));
        System.out.println(sampleString2.substring(0,5).equals(testPrefix));
    }
}
