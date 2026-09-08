import java.util.Scanner;

public class ATM{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          double balance = 10000;
          double PIN = 1234;
 
          System.out.print("Enter your Account Number = ");
          long accountNumber = sc.nextLong();

          System.out.print("Enter your PIN number = ");
          double pin = sc.nextDouble();

          if(pin == PIN){
              System.out.print("PIN verified successfully");
              System.out.print("1. Deposit");
              System.out.print("2. Withdraw");
              System.out.print("Choose Option (1 or 2) = ");
              int option = sc.nextInt();
      
              sc.nextLine();

              if(option == 1){
                    System.out.print("Enter Deposit amount = ");
                    double deposit = sc.nextDouble();
                    balance = deposit + balance;
                    System.out.print("Deposit successfully ! Updated balance = " + balance);
               }
               else if(option == 2){
                     System.out.print("Enter withdarw amount = ");
                     double withdraw = sc.nextDouble();
                       
                     if(withdraw <= balance){
                            balance = balance - withdraw;
                            System.out.print("Withdraw successfull! Updated Balance = " + balance);
                      }
                      else{
                            System.out.print("Insuffient Money");
                      }
               }
               else{
                     System.out.print("Wrong Option");
               }
           }
           else{
                 System.out.print("Invalid PIN");
            }
           sc.close();
     }
}
                    