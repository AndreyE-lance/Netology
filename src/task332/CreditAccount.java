package task332;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    public CreditAccount() {
        super(0);
    }

    @Override
    boolean addMoney(int amount) {
        if (this.balance >= 0) return false;
        else {
            return super.addMoney(amount);
        }
    }

}
