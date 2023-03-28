public class Trader  {
    private String name;
   private Account account;

    Trader(String name){
        this.name = name;
        this.account = new Account();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTrade(Trade trade) {
        double value = trade.getQuantity() * trade.getPrice();
        account.setTotal(value);
    }

    void getAccountValue() {
        System.out.println(account.getTotal());
    }


}
