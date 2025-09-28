public class Bankaccount {
    // Attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;


    public Bankaccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {
        Bankaccount acc1 = new Bankaccount("Shreyansh", 123456, 5000);

        acc1.displayBalance();

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayBalance();
    }
}

