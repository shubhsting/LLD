package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
