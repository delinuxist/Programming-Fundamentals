public class Trader extends Account {
    private String name;
    Trade trade;
    Trader(Trade trade){
        this.trade = trade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTrade() {
        double value = trade.getPrice() * trade.getQuantity();
        this.setTotal(value);
    }


}
