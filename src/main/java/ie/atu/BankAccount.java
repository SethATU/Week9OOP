package ie.atu;

public class BankAccount {
    private String accNo;
    private String name;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        if (balance <= 0)
        {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount()
    {
        this.accNo = "ACC12345";
        this.name = "Seth";
        this.balance = 100;
    }

    public String getAccNo() {
        return accNo;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public double deposit(double depositAmount)
    {
        balance = balance + depositAmount;
        if (depositAmount < 0)
        {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        return balance;
    }

    public double withdraw(double withdrawAmount)
    {
        balance = balance - withdrawAmount;
        if (withdrawAmount < 0)
        {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        return balance;
    }
}
