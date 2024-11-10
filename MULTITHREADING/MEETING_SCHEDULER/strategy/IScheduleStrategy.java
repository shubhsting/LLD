package MULTITHREADING.MEETING_SCHEDULER.strategy;

import MULTITHREADING.MEETING_SCHEDULER.model.Meeting;
import MULTITHREADING.MEETING_SCHEDULER.model.MeetingRoom;

import java.util.List;

public interface IScheduleStrategy {
    List<Long> filter(Meeting meeting, List<MeetingRoom> rooms);
}
