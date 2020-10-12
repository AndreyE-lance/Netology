package task332;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private int balance;
    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    boolean pay(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else return false;
    }



    @Override
    boolean transfer(Account account, int amount) {
        if (amount <= this.balance) {
            if (account.addMoney(amount)) {
                this.balance -= amount;
                return true;
            } else return false;
        } else return false;
    }

    @Override
    boolean addMoney(int amount) {
        this.balance+=amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }

}
