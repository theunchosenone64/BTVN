package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex9;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
