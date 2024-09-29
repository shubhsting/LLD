package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER;

public abstract class Approver {
    public Approver next;
    public ApproverType approverType;

    public Approver(ApproverType approverType) {
        this.next = null;
        this.approverType = approverType;
    }

    public Approver setNext(Approver approver) {
        Approver current = this;
        while (current.next != null)
            current = current.next;
        current.next = approver;
        return this;
    }

    public void sendForApproval(AccessRequest request) {
        boolean approved = isApproved(request);
        System.out.println("is approved" + approved);
        if (!approved) {
            System.out.println("access request have been rejected!!");
        } else {
            if (next != null)
                next.sendForApproval(request);
        }
    }

    public abstract boolean isApproved(AccessRequest request);
}
