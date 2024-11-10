package MULTITHREADING.MEETING_SCHEDULER.scheduler;

import MULTITHREADING.MEETING_SCHEDULER.model.MeetingRoom;
import MULTITHREADING.MEETING_SCHEDULER.model.Meeting;
import MULTITHREADING.MEETING_SCHEDULER.model.MeetingScheduleMessage;
import MULTITHREADING.MEETING_SCHEDULER.strategy.IScheduleStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class MeetingScheduler {
    private static final int CONSUMER_POOL_SIZE = 3;
    private static final int NO_OF_ROOMS = 3;
    private final Map<Long, MeetingRoom> rooms;
    private final Queue<MeetingScheduleMessage> meetingScheduleMessageQueue;
    private final IScheduleStrategy scheduleStrategy;

    public MeetingScheduler(IScheduleStrategy scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        rooms = new HashMap<>();
        meetingScheduleMessageQueue = new LinkedList<>();
        start();
    }

    private void start() {
        for (int index = 0; index < NO_OF_ROOMS; index++) {
            rooms.put((long) index + 1, new MeetingRoom((long) index + 1, 1L, index + 2L, new ArrayList<>()));
        }
        for (int index = 0; index < CONSUMER_POOL_SIZE; index++) {
            new Thread(new MeetingSchedulerWorker(meetingScheduleMessageQueue, rooms)).start();
        }
    }

    public void schedule(final Meeting meeting) {
        List<Long> availableRooms = scheduleStrategy.filter(meeting, rooms.values().stream().toList());
        if (availableRooms.isEmpty()) {
            System.out.println("No available rooms found for meeting" + meeting.getMeetingId());
            return;
        }
        synchronized (meetingScheduleMessageQueue) {
            meetingScheduleMessageQueue.add(new MeetingScheduleMessage(meeting, availableRooms));
            meetingScheduleMessageQueue.notifyAll();
        }
    }

    public void log() {
        for (MeetingRoom room : rooms.values()) {
            room.log();
        }
    }
}
