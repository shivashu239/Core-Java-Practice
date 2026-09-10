public class Sun {
   public static void main(String[] args) {

         int[] arr = {45,2,0,9,25,0,87,0};
         int count = 0;

         for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
         }

         for(int i = count; i < arr.length; i++) {
               arr[i] = 0;
         }
         
         System.out.print("Array after moving zeroes = " + " ");
         for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
         }
    }
}