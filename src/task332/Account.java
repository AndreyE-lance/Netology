package task332;

public abstract class Account {
    int balance = 0;

    public Account(int balance) {
        this.balance = balance;
    }

    boolean pay(int amount) {
        balance -= amount;
        return true;
    }

    boolean transfer(Account account, int amount) {
        account.addMoney(amount);
        this.balance -= amount;
        return true;
    }

    boolean addMoney(int amount) {
        balance += amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}