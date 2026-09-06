package ARRAY;

public class array {
    public static void main(String[] args) {
        int[] a = { 14, 18, 22, 26, 35, 38, 48, 58};
        int[] b = { 60, 65, 69, 73, 75, 78, 80, 85};
        int[] c = new int [ a.length + b.length];

        for ( int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for ( int i = 0; i < a.length; i++) {
            c[ a.length + i] = b[i];     
        }
        for ( int element : c) {
            System.out.print( element + " ");
        }
    }
}