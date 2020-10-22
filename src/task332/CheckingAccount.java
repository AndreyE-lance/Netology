package task332;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    boolean pay(int amount) {
        if (amount <= this.balance) {
            return super.pay(amount);
        } else return false;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (amount <= this.balance) {
            return super.transfer(account,amount);
        } else return false;
    }

}