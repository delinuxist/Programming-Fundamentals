package Client;

import MembershipType.Bronze;
import MembershipType.Gold;
import MembershipType.MembershipBase;
import MembershipType.Silver;
import Trade.Trade;
import enums.Membership;

public class Client {
    private String firstName;
    private String lastName;

    private double totalTrades;
    private MembershipBase type;

    private int points = 0;

    private int tradeLimit;

    public Client(String firstName, String lastName){
        type = new Bronze(Membership.Bronze);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void upgradeClient () {
        if(this.points >= type.getMin() && this.points < type.getMax()-10){
            type = new Bronze(Membership.Bronze);
        } else if(this.points >= type.getMin()+10 && this.points < type.getMax()) {
            type = new Silver(Membership.Silver);
        } else {
            type = new Gold(Membership.Gold);
        }
    }
    public void addTrade(Trade trade) {
        if(!canTrade()){
            addPoints(trade);
        }
    }

    void addPoints(Trade trade) {
        this.points++;
        totalTrades += trade.value();
        upgradeClient();
        this.tradeLimit++;
    }

    public boolean canTrade() {
        if(type.getType().getHasTradingLimit()){
           return false;
        } else{
           return tradeLimit > type.getType().getMaxTrade();
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", totalTrades=" + totalTrades +
                ", type=" + type.getType() +
                ", points=" + points +
                '}';
    }
}
