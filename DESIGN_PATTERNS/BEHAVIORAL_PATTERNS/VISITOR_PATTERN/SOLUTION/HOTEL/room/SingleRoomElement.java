package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor.RoomVisitor;

public class SingleRoomElement implements RoomElement {
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
