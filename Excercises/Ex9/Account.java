package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex9;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    public void display() {
        System.out.println("Account type: " + getAccountType());
        System.out.println("Balance: " + balance);
    }
}
