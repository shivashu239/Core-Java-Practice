import java.util.Scanner;
class BankAccount {
     private String accountHolder;
     private double balance;
     class Transaction{
          void setShowDetails(String name, double initialBalance) {
                accountHolder = name;
                if (initialBalance > 0) {
                        balance = initialBalance;
                }
                 else{
                       System.out.println("Balance can not be zero");
                }
            }
                public void getAccountHolder(){
                       System.out.println("Name = " + accountHolder);
                }
                public void getBalance(){
                       System.out.println("Balane = " + balance);
                }
                public void deposit(double amount){
                       if(amount > 0) {
                                balance = amount + balance;
                                System.out.println("Deposited = " + amount);
                                System.out.println("Updated balance = " + balance);
                        }
                        else {
                                System.out.println("Invalid amount");
                        }
                }
                public void withdraw(double amount) {
                        if(amount > 0 && amount <= balance) {
                                balance = balance - amount;
                                System.out.println("withdraw = " + amount);
                                System.out.println("Updated balance = " + balance);
                         }
                         else{
                                System.out.println("Insuffient balance");
                         }
                }
       }
}
public class Input {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
         
             BankAccount b = new BankAccount();
             BankAccount.Transaction t = b.new Transaction();

             System.out.print("Enter your name = ");
             String name = sc.nextLine();

             System.out.print("Enter Balance = ");
             double initialBalance = sc.nextDouble();

             t.setShowDetails(name, initialBalance);

             System.out.println("  AccountInfo    ");
             t.getAccountHolder();
             t.getBalance();
          
             sc.nextLine();

             System.out.print("Enter amount to deposit = ");
             double deptAmount = sc.nextDouble();
             t.deposit(deptAmount);

             System.out.print("Enter amount to withdraw = ");
             double withAmount = sc.nextDouble();
             t.withdraw(withAmount);
            
             sc.nextLine();
             sc.close();
     }
}                          