 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        int i;  
        String stars = "";
        for(i = 0; i < numberOfStars; i++) {
          stars += "*";
    }
    return stars;
    }

    public static String getTriangle(int numberOfRows) {
       int i;
       int j;
       String stars = "";
        for(i = 0; i < numberOfRows; i++) {
               for(j = 0; j <= i; j++) {
                  stars += "*";
                }
                stars += "\n";
               }
               return stars;
            }

    public static String getSmallTriangle() {
    int i;
    int j = 4;
    String stars = "";
        for(i = 0; i < 4; i++) {
               for(j = 0; j <= i; j++) {
                  stars += "*";
                }
                stars += "\n";
               }
               return stars;
            }

    public static String getLargeTriangle() {
        int i;
        int j = 9;
        String stars = "";
        for(i = 0; i < 9; i++) {
            for(j = 0; j <= i; j++) {
            stars += "*";
         }
         stars += "\n";
        }
        return stars;
    }    
}
