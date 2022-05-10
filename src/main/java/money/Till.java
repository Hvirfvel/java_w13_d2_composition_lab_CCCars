package money;

public class Till {

    private int balance;

    public Till(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void reduceBalance(int price) {
        balance -= price;
    }

    public void increaseBalance(int price) {
        balance += price;
    }
}
