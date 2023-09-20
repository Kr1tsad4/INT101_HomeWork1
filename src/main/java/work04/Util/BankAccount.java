package work04.Util;

public class BankAccount {

    private int number;
    private Person owner;
    private double balance = 0;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;

    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public void transfer(double amount, BankAccount account) {
        balance -= amount;
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount" + number + "\nOwner: " + owner + "\nBalance: " + balance;

    }

}
