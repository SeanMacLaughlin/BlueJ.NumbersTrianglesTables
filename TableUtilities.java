 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int x;
        int y;
        String table = "";
        for (x = 1; x <= 5; x++) {
            for(y = 1; y <= 5; ++y) {
                table += table.format("%3d", x * y) + " |";
            }
            table += "\n";
        }
        return table;
     }

    public static String getLargeMultiplicationTable() {
        int x;
        int y;
        String table = "";
        for(x = 1; x <= 10; x++) {
            for(y = 1; y <= 10; ++y) {
                table += table.format("%3d", x * y) + " |";
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
       int x;
       int y;
       String table = "";
       for(x = 1; x <= tableSize; x++) {
           for(y = 1; y <= tableSize; y++) {
               table += table.format("%3d", x * y) + " |";
            }
            table += "\n";
        }
        return table;
    } 
}

