package Trade;

import java.time.LocalDate;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private LocalDate date;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calcDividend();
}
