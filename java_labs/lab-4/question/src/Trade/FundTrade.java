package Trade;

public class FundTrade extends Trade {
    private double dividendPercentage;
    public FundTrade(String id, String symbol, int quantity, double price, double dividendPercentage){
        super(id,symbol,quantity,price);
        this.dividendPercentage = dividendPercentage;
    }
    @Override
    double calcDividend() {
        return (this.getPrice()*(dividendPercentage/100));
    }
}
