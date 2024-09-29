package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.ACCESS_REQUEST_APPROVER;

public class AccessRequest {
    public String title;
    public String description;
    public Approver approver;
    public AccessRequest(String title, String description, Approver approver) {
        this.title = title;
        this.description = description;
        this.approver = approver;
    }

    public void submit() {
        approver.sendForApproval(this);
    }
}

