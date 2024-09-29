package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER.impl;

import java.util.Scanner;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER.AccessRequest;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER.Approver;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER.ApproverType;

public class ManagerApprover extends Approver {
    public ManagerApprover() {
        super(ApproverType.MANAGER);
    }

    @Override
    public boolean isApproved(AccessRequest request) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hey! " + approverType + " do you want to approve request with title " + request.title);
        String s = scn.next();
        if (s.equals("YES"))
            return true;
        return false;
    }
}
