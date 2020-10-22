package task332;

public class SavingsAccount extends Account {

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    boolean pay(int amount) {
        return false;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (amount <= this.balance) {
            return super.transfer(account, amount);
        } else return false;
    }
}
