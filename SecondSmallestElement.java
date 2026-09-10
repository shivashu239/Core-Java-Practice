public class SecondSmallestElement {
    public static void main(String[] args) {
    
          int[] arr = {14, 14, 15, 58, 65, 23, 45, 65, 16};
          int min1 = arr[0];
          int min2 = Integer.MAX_VALUE;

          for(int i = 1; i < arr.length; i++) {
              if(arr[i] < min1) {
                    min2 = min1;
                    min1 = arr[i];
             }
              else if(arr[i] < min2 && arr[i] != min1){
                   min2 = arr[i];
              }
           }
           System.out.println("Second Smallest Element = " + min2);
     }
}
                    