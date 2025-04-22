package Banking_24th_Feb2025;

class BankAccount {
    String AccountNumber;
    String AccountHolderName;
    double Balance;

    public BankAccount(String AccountHolderName, double Balance) {
        this.AccountNumber = generateAccountNumber();
        this.AccountHolderName = AccountHolderName;
        this.Balance = Balance;
    }

    private String generateAccountNumber() {
        return String.valueOf((long) (Math.random() * 1_000_000_000_000L));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println(amount + " deposited. New Balance: " + Balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + Balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder Name: " + AccountHolderName);
        System.out.println("Balance: " + Balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String AccountHolderName, double Balance) {
        super(AccountHolderName, Balance);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String AccountHolderName, double Balance) {
        super(AccountHolderName, Balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("John Doe", 5000);
        System.out.println("Savings Account Created for " + savings.AccountHolderName);
        savings.checkBalance();
        savings.deposit(2000);
        savings.withdraw(1000);
        savings.checkBalance();

        CurrentAccount current = new CurrentAccount("Jane Smith", 10000);
        System.out.println("\nCurrent Account Created for " + current.AccountHolderName);
        current.checkBalance();
        current.deposit(3000);
        current.withdraw(5000);
        current.checkBalance();
    }
}
