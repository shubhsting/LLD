package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.computes;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.visitor.OperationVisitor;

public interface ComputeElement {
    public void accept(OperationVisitor operationVisitor);
}
