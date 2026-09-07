public class FloydTriangle {
    public static void main(String[] args) {
    int num = 1;
    int rows = 10;

    for(int i = 1; i <= rows; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
}
}
