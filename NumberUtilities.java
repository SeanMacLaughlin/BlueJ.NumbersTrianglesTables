import java.lang.Math;

public class NumberUtilities {

    public static String getRange(int stop) {
        int i;
        String range = "";
        for(i = 0; i < stop; i++) {
            range += i; 
        } 
        return range;
    }
    public static String getRange(int start, int stop) {
        int i;
        String range = "";
        for(i = start; i < stop; i++) {
            range += i;
    }
    return range;
}


    public static String getRange(int start, int stop, int step) {
        int i;
        String range = "";
        for(i = start; i < stop || i != step; i++) {
            range +=i;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        int i;
        String evens = "";
        for (i = start; i < stop; i++) {
            if(i % 2 == 0) {
            evens += i;
            }
        }
        return evens;
    }


    public static String getOddNumbers(int start, int stop) {
        int i;
        String odds = ""; 
        for(i = start; i < stop; i++) {
            if(i % 2 == 1) {
                odds += i;
            }
        }
        return odds;
    }



    public static String getExponentiations(int start, int stop, int exponent) {
        int i;
        String expo = "";
        for(i = start; i <= stop; i++) {
            expo += (int) (Math.pow(i, exponent));
        }
        return expo;
    }
}
