package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.computes;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.visitor.OperationVisitor;

public class AthenaComputeElement implements ComputeElement {
    @Override
    public void accept(OperationVisitor visitor) {
        visitor.visit(this);
    }
}
