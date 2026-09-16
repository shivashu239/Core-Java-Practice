import java.util.Scanner;
public class Number{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     int n,c,r,s=0;

     System.out.print("Enter Number : ");
     n = sc.nextInt();

     c = n;

     while(n>0){
        r = n%10;
        s = (s*10)+r;
        n = n/10;
     }
     if(c==s){
        System.out.print("Palindrome");
     }
     else{
        System.out.print("Not Palindrome");
     }
     sc.close();
   }
}