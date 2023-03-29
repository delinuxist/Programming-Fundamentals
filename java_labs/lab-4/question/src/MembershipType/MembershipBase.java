package MembershipType;

import enums.Membership;

public class MembershipBase {
    private Membership type;

    MembershipBase(Membership type){
        this.type = type;
    }

    public Membership getType() {
        return type;
    }
}
