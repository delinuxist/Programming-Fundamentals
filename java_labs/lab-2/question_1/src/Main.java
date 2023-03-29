public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var t1 = new Trade("t1","APPI",20,15.0);
        var t2 = new Trade("t1","APPI",20,10.0);

        var T1 = new Trader("Mark");

        System.out.println(t1.toString());

        T1.addTrade(t1);

        T1.getAccountValue();






    }
}