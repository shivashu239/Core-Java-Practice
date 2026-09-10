public class SecondLargestElement {
    public static void main(String[] args) {
        
          int[] arr = {25,16,38,10,35,48,20,50,50};
          int max1 = arr[0];
          int max2 = Integer.MAX_VALUE;
      
          for(int i = 1; i <arr.length; i++){
                if(arr[i] > max1) {
                     max2 = max1;
                     max1 = arr[i];
                     }
                else if (arr[i] > max2 && arr[i] != max1){
                     max2 = arr[i];
                }
          }
          System.out.println("Second Largest element = " + max2);
   }
}
           