package task332;

public class SavingsAccount extends Account {
    private int balance;

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    @Override
    boolean pay(int amount) {
        return false;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)&&(this.balance-amount)>=0) return true;
        else return false;
    }

    @Override
    boolean addMoney(int amount) {
        this.balance=this.balance+amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }

}
