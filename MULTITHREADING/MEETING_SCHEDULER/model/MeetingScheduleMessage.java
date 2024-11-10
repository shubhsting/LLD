package MULTITHREADING.MEETING_SCHEDULER.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class MeetingScheduleMessage {
    private Meeting meeting;
    private List<Long> availableRooms;
}
