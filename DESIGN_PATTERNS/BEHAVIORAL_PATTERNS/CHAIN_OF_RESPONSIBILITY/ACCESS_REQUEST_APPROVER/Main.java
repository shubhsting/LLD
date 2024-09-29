package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER.impl.ManagerApprover;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER.impl.SkipManagerApprover;

public class Main {
    public static void main(String[] args) {
        Approver approver = new ManagerApprover().setNext(new SkipManagerApprover());
        AccessRequest request = new AccessRequest("HELLO", "hello bhai ", approver);
        request.submit();
    }
}
