package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.visitor;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.computes.AthenaComputeElement;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.computes.RedshiftComputeElement;

public interface OperationVisitor {
    public void visit(AthenaComputeElement athenaComputeElement);

    public void visit(RedshiftComputeElement redshiftComputeElement);
}
