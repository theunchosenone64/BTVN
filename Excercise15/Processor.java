package nguyennhathuy_5372.Lec11_Encapsulation.Excercise15;

public class Processor {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.addInfo();
        account.display();

        account.deposit(500);
        account.withdraw(300);

        account.display();
    }
}
