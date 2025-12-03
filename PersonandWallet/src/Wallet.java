public class Wallet {
    int balance;

    public Wallet(){
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void putMoney(int money){
        balance += money;
    }
    public void getMoney(int money){
        if(balance >= money){
            balance -= money;
        }
    }
}