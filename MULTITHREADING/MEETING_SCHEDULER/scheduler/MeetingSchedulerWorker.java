package MULTITHREADING.MEETING_SCHEDULER.scheduler;

import MULTITHREADING.MEETING_SCHEDULER.model.Meeting;
import MULTITHREADING.MEETING_SCHEDULER.model.MeetingRoom;
import MULTITHREADING.MEETING_SCHEDULER.model.MeetingScheduleMessage;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Map;
import java.util.Queue;

@AllArgsConstructor
public class MeetingSchedulerWorker implements Runnable {
    private final Queue<MeetingScheduleMessage> meetingScheduleMessageQueue;
    private final Map<Long, MeetingRoom> rooms;

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            MeetingScheduleMessage message;
            synchronized (meetingScheduleMessageQueue) {
                while (meetingScheduleMessageQueue.isEmpty()) {
                    meetingScheduleMessageQueue.wait();
                }
                message = meetingScheduleMessageQueue.remove();
            }
            bookRoom(message.getMeeting(), message.getAvailableRooms());
        }
    }

    public void bookRoom(Meeting meeting, List<Long> availableRooms) {
        for (Long roomNo : availableRooms) {
            MeetingRoom room = rooms.get(roomNo);
            synchronized (room) {
                if (room.book(meeting)) break;
            }
        }
    }
}
