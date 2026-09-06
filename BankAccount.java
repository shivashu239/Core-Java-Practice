class Bank {
    private String accountHolder;
    private long bankAccountNumber;
    private double balance;

    Bank( String accountHolder, long bankAccountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }

    public void setAccountHolder ( String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void getAccountHolder() {
        System.out.println(" Account Holder name is = " + accountHolder);
    }
    public void setBankAccountNumber ( long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    public void getBankAccountNumber() {
        System.out.println(" Account number is = " + bankAccountNumber);
    }
    public void deposit ( double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
        else {
            System.out.println( " Amount is invalid");
        }
    }
    public void withdraw ( double amount) {
        if ( amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " +  amount);
        }
        else {
            System.out.println( " Amount is invalid");
        }
    }
    public void getBalance() {
        System.out.println( " Total balance is = " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Bank b1 = new Bank( "Shivanshu", 866114369, 36241.36);

        b1.setAccountHolder("Shivanshu");
        b1.getAccountHolder();
        b1.setBankAccountNumber(864848456);
        b1.getBankAccountNumber();
        b1.deposit(500);
        b1.withdraw(100);
        b1.getBalance();
    }
}
