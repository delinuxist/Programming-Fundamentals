package MembershipType;


import enums.Membership;

public class Gold extends MembershipBase {
    public Gold(Membership type) {
        super(type);
    }

    @Override
    public void addMembershipLimit() {
        this.setLimit(20);
    }

}
