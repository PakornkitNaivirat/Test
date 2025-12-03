public class TestPersonandWallet {
    public static void main(){
        Person jame = new Person("Jame","Smith");
        jame.printInfo();
        System.out.println();

        System.out.println("save money 1000");
        jame.saveMoney(1000);
        jame.printInfo();
        System.out.println();

        System.out.println("use money 200");
        jame.useMoney(200);
        jame.printInfo();
        System.out.println();

        System.out.println("Change wallet");
        Wallet change = new Wallet();
        jame.changeNewWallet(change);
        jame.printInfo();
        System.out.println();

    }
}
