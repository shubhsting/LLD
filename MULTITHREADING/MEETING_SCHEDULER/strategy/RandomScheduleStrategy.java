package MULTITHREADING.MEETING_SCHEDULER.strategy;

import MULTITHREADING.MEETING_SCHEDULER.model.Meeting;
import MULTITHREADING.MEETING_SCHEDULER.model.MeetingRoom;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class RandomScheduleStrategy implements IScheduleStrategy {

    @Override
    public List<Long> filter(Meeting meeting, List<MeetingRoom> rooms) {
        return rooms.stream().filter(room -> room.isFree(meeting.getStartTime(), meeting.getEndTime()))
                .map(MeetingRoom::getRoomNo)
                .collect(Collectors.toList());
    }
}
