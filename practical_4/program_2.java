

class BankAccount {
    protected String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void openAccount() {
        System.out.println("Account " + accountNumber + " opened for " + holderName);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance in account " + accountNumber + ": " + balance);
    }
}

class SavingAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05;

    public SavingAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void calInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Interest calculated for saving account " + accountNumber + ": " + interest);
        deposit(interest);
    }
}

class FixedDepositAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.08; // 8% interest rate

    public FixedDepositAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void calInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Interest calculated for fixed deposit account " + accountNumber + ": " + interest);
        deposit(interest);
    }
}

public class program_2 {
    public static void main(String[] args) {

        SavingAccount savingAcc = new SavingAccount("SA123", "Tommy Vercetti", 999999999);
        savingAcc.openAccount();
        savingAcc.checkBalance();
        savingAcc.deposit(500);
        savingAcc.checkBalance();
        savingAcc.withdraw(200);
        savingAcc.checkBalance();
        savingAcc.calInterest();
        savingAcc.checkBalance();


        FixedDepositAccount fdAcc = new FixedDepositAccount("FD456", "Carl Johnson", 670000000);
        fdAcc.openAccount();
        fdAcc.checkBalance();
        fdAcc.deposit(1000);
        fdAcc.checkBalance();
        fdAcc.withdraw(500);
        fdAcc.checkBalance();
        fdAcc.calInterest();
        fdAcc.checkBalance();
    }
}

