import java.util.Scanner;
 public class Shopping{
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter Product Name = ");
           String productName = sc.nextLine();

           System.out.print("Enter price = ");
           double price = sc.nextDouble();

           System.out.print("Enter quantity = ");
           int quantity = sc.nextInt();

           double total = price * quantity;
           double finalAmount = total;
 
           double discount = 0;

            
           if(total > 5000){
                discount = total * 0.15;
                finalAmount = total - discount;
           }
           else if(total <= 5000 && total >= 2000){
                discount = total * 0.10;
                finalAmount = total - discount;
           }
           else{
                  finalAmount = total;
           }
           System.out.println("Product name = " + productName);
           System.out.println("Price = " + price);
           System.out.println("Quantity = " + quantity);
           System.out.println("Total amount = " + total);
           System.out.println("Discount = " + discount);
           System.out.println("Final Amount = " + finalAmount);
 
           sc.close();
                
     }
}
                       