import java.util.Scanner;
public class Armstrong{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Number : ");
      int n = sc.nextInt();
      int c = n;

      int sum = 0;

      while(n>0){
         int d = n%10;
         n = n/10;
         sum += (d*d*d);
      }
      if(c == sum){
         System.out.print("Number is Armstrong");
      }
      else{
             System.out.print("Number is not Armstrong");
      }
   }
}