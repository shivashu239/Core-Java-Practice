interface Payable {
    void makePayment(double amount);
}
abstract class Account {
    private String holderName;
    private double balance;

    Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
        this.balance += amount;
        System.out.println("Deposited : " + amount + ", New balance = " + balance);
    } 
    else{
        System.out.println("Invalid amount");
    }
}
    public void getBalance() {
            System.err.println("Balance = " + balance);
    }
}
class LoanAccount extends Account implements Payable {
    private double loanAmount;
    LoanAccount(String holderName, double balance, double loanAmount) {
        super(holderName, balance);
        this.loanAmount = loanAmount;
    }
    public void makePayment(double amount) {
        if (amount > 0 && amount <= loanAmount) {
            loanAmount -= amount;
        System.out.println("Payment made = " + amount + ", Remaing loan = " + loanAmount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void getLoanAmount() {
        if ( loanAmount > 0) {
            System.out.println("Remaing loan amount = " + loanAmount);
        }
    }
}
public class Loan {
    public static void main(String[] args) {
        LoanAccount ln = new LoanAccount("Shivanshu", 50000,20000);
        
        ln.deposit(5000);
        ln.getBalance();

        ln.makePayment(10000);
        ln.getLoanAmount();
    }
}