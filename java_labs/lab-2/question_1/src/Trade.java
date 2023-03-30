public class Trade {
    private String id;
    private String symbol;

    private int quantity;

    private double price;


    Trade(String id, String symbol,int quantity,double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    Trade(String id, String symbol,int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price < 0){
            return;
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
