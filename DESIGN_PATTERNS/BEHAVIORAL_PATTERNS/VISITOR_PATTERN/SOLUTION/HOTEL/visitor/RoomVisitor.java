package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room.DoubleRoomElement;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room.SingleRoomElement;

public interface RoomVisitor {
    public void visit(SingleRoomElement singleRoomElement);
    public void visit(DoubleRoomElement doubleRoomElement);
}
