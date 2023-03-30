package MembershipType;

import enums.Membership;

public class Silver extends MembershipBase {


   public Silver(Membership type) {
       super(type);
   }

    @Override
    public void addMembershipLimit() {
        this.setLimit(10);
    }

}
