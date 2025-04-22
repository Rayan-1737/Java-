abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingAccount extends BankAccount {
    public SavingAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Assignment_2_17th_Feb {
    public static void main(String[] args) {
        SavingAccount myAccount = new SavingAccount(5000);

        System.out.println("Initial Balance: " + myAccount.getBalance());
        myAccount.deposit(2000);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(1500);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

        myAccount.withdraw(7000);
    }
}

