package MembershipType;

import enums.Membership;

public abstract class MembershipBase {
    private Membership type;
    private int limit;

    private int min  = 0;
    private int max = 20;

    MembershipBase(Membership type){
        this.type = type;
        addMembershipLimit();
    }

    public Membership getType() {
        return type;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public abstract void addMembershipLimit();
}
