package MembershipType;

import enums.Membership;

public class Bronze extends MembershipBase {


    public Bronze(Membership type) {
        super(type);
    }

    @Override
    public void addMembershipLimit() {
        this.setLimit(5);
    }
}
