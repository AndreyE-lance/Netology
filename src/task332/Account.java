package task332;

public abstract class Account {
    private int balance;
    boolean pay(int amount) {
        this.balance-=amount;
        return true;
    }

    boolean transfer(Account account, int amount){
        account.balance+=amount;
        this.balance-=amount;
        return true;
    }

    boolean addMoney(int amount){
        balance+=amount;
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
