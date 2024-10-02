package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.visitor;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.computes.AthenaComputeElement;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.SAMPLE.computes.RedshiftComputeElement;

public class CreateJobOperation implements OperationVisitor {
    @Override
    public void visit(AthenaComputeElement element) {
        System.out.println("create job called for athena");
    }

    @Override
    public void visit(RedshiftComputeElement element) {
        System.out.println("create job called for redshift");
    }
}
