package task332;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    private int balance;

    public CreditAccount() {
        this.balance = 0;
    }

    @Override
    boolean pay(int amount) {
        this.balance = this.balance - amount;
        return true;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)) return true;
        else return false;
    }

    @Override
    boolean addMoney(int amount) {
        if (this.balance >= 0) return false;
        else {
            this.balance = this.balance + amount;
            return true;
        }
    }

    public int getBalance() {
        return balance;
    }
}
