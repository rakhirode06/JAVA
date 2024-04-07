public class Bank {
    private String customerName;
    private int accountNo;
    private String bankName;
    private String accountType;
    private double balance;

    public Bank(String customerName, int accountNo, String bankName, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.bankName = bankName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void getCustomerData() {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Account No.: " + this.accountNo);
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
    }

    public void printCustomerData() {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Account No.: " + this.accountNo);
    }

    public void debit(double amount) {
        if (this.balance >= 2000 && this.balance - amount >= 2000) {
            this.balance -= amount;
            System.out.println("Debit successful. New balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance to perform debit operation.");
        }
    }

    public void credit(double amount) {
        this.balance += amount;
        System.out.println("Credit successful. New balance: " + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        
        Bank bankAccount = new Bank("John Doe", 123456789, "ABC Bank", "Savings", 5000.0);

        
        bankAccount.getCustomerData();

        
        bankAccount.debit(1000);

        
        bankAccount.credit(2000);

        
        bankAccount.printCustomerData();

        
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
}
