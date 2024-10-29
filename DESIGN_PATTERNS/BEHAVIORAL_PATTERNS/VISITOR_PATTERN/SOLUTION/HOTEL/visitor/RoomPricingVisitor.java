package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room.DoubleRoomElement;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room.SingleRoomElement;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoomElement singleRoomElement) {
        System.out.println("single room pricing visitor called");
    }

    @Override
    public void visit(DoubleRoomElement doubleRoomElement) {

    }
}