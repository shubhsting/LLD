package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room.RoomElement;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.room.SingleRoomElement;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor.RoomMaintainenceVisitor;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor.RoomPricingVisitor;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.VISITOR_PATTERN.SOLUTION.HOTEL.visitor.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomObj = new SingleRoomElement();

        RoomVisitor pricingRoomVisitor = new RoomPricingVisitor();

        RoomVisitor roomMaintenanceVisitor = new RoomMaintainenceVisitor();

        singleRoomObj.accept(roomMaintenanceVisitor);
    }
}
