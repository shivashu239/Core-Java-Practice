public class ReversePyramid {
    public static void main(String[] args) {
        int rows = 10;

        for(int i = rows; i >= 1; i--) {
            for(int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}