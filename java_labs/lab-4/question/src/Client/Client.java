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
    private MembershipBase type;

    private int points = 0;

    private int limit;

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
            this.points++;
            upgradeClient();
            this.limit++;
    }

    public void canTrade() {
        if(limit > type.getLimit()){
            System.out.println("Can't trade");
        } else {
            System.out.println("Can trade");
        }
    }

    public void getPoints() {
        System.out.println(this.points);
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type=" + type.getType()  +
                ", points=" + points +
                '}';
    }
}
