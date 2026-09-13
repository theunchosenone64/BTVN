package nguyennhathuy_5372.Lec11_Encapsulation.Excercise15;

class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    void addInfo() {
        accountNumber = "363636";
        owner = "Nguyen Nhat Huy";
        balance = 1000000;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        }
    }

    boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful!");
            return true;
        }

        System.out.println("Not enough money!");
        return false;
    }

    void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}
