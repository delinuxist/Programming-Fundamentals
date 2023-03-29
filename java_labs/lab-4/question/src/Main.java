import Trade.BondTrade;
import Client.Client;

public class Main {
    public static void main(String[] args) {
        var t1 = new BondTrade("T1","APPI",20,15.0,1000);
        var t2 = new BondTrade("T1","APPI",20,15.0,1000);
        var t3 = new BondTrade("T1","APPI",20,15.0,1000);


        var cl1 = new Client("Mark","Obeng");
        var cl2 = new Client("Gerald","O");

        cl1.addTrade(t1);
        cl1.addTrade(t1);
        cl1.addTrade(t1);
        cl1.addTrade(t1);cl1.addTrade(t1);
        cl1.addTrade(t2);
        cl1.addTrade(t3);
        cl2.addTrade(t1);

        cl2.canTrade();


        System.out.println(cl1);
        System.out.println(cl2);
    }
}