package task332;

public class Main {
    public static void main(String[] args) {
        Account accChk = new CheckingAccount(100);
        Account accCrd = new CreditAccount();
        Account accSvng = new SavingsAccount(200);
        accCrd.pay(50);
        System.out.println(accCrd.getBalance());
        accChk.transfer(accCrd,30);
        System.out.println(accChk.getBalance());
        System.out.println(accCrd.getBalance());
        accSvng.addMoney(100);
        System.out.println(accSvng.getBalance());

    }
}
