import Trade.BondTrade;
import Client.Client;

public class Main {
    public static void main(String[] args) {
        var t1 = new BondTrade("T1","APPI",20,15.0,1000);
        var t2 = new BondTrade("T1","APPI",20,15.0,1000);
        var t3 = new BondTrade("T1","APPI",20,15.0,1000);


        var cl1 = new Client("Mark","Debugger");
        var cl2 = new Client("Gerald","Compile");

        cl1.addTrade(t1);
        cl1.addTrade(t1);
        cl1.addTrade(t1);
        cl1.addTrade(t2);
        cl1.addTrade(t3);


        cl1.canTrade();
        System.out.println(cl1);
        System.out.println(cl2);
    }
}