public class Person {
    String firstname,lastname;
    Wallet myWallet = new Wallet();

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int checkMoney(){
        return myWallet.getBalance();
    }

    public void useMoney(int money){
        myWallet.getMoney(money);
    }
    public void saveMoney(int money){
        myWallet.putMoney(money);
    }
    public void changeNewWallet(Wallet newWallet){
        newWallet.putMoney(myWallet.getBalance());
        myWallet = newWallet;
    }

    public void printInfo(){
        System.out.println("Name : " + firstname + " " + lastname);
        System.out.println("Wallet : " + myWallet.getBalance());
    }
}
