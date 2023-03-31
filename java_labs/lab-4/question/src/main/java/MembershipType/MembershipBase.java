package MembershipType;


import enums.Membership;

public class MembershipBase {
    private Membership type;

    private int min  = 0;
    private int max = 20;

    MembershipBase(Membership type){
        this.type = type;
    }

    public Membership getType() {
        return type;
    }



    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }



}
