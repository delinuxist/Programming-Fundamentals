import java.util.ArrayList;
import java.util.List;

public class Account{
    private static double total;

    private List<Trade> trades = new ArrayList<Trade>();
    private List<Trade> filteredTrade = new ArrayList<>();

    public void setTotal(double total) {
        this.total += total;
    }

    public double getTotal() {
        return this.total;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public List<Trade> filterTrades() {
        for(Trade i: trades){
            if(i.getPrice() >= 10){
                filteredTrade.add(i);
            }
        }
        return filteredTrade;
    }

    public void setTrades(Trade trade) {
        trades.add(trade);
    }
}
