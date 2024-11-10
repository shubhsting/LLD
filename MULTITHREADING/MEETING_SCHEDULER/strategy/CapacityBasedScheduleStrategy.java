package MULTITHREADING.MEETING_SCHEDULER.strategy;

import MULTITHREADING.MEETING_SCHEDULER.model.Meeting;
import MULTITHREADING.MEETING_SCHEDULER.model.MeetingRoom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CapacityBasedScheduleStrategy implements IScheduleStrategy {
    @Override
    public List<Long> filter(Meeting meeting, List<MeetingRoom> rooms) {
        final Integer participants = meeting.getParticipants().size();
        return rooms.stream().filter(meetingRoom -> meetingRoom.getCapacity() >= participants
                        && meetingRoom.isFree(meeting.getStartTime(), meeting.getEndTime()))
                .sorted(Comparator.comparingLong(MeetingRoom::getCapacity))
                .map(MeetingRoom::getRoomNo).collect(Collectors.toList());
    }
}
