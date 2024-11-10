package MULTITHREADING.MEETING_SCHEDULER.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class MeetingRoom {

    private Long roomNo;
    private Long floor;
    private Long capacity;
    private List<Meeting> meetings;

    public boolean isFree(Date startTime, Date endTime) {
        for (Meeting meeting : meetings) {
            if ((startTime.equals(meeting.getStartTime()) || startTime.after(meeting.getStartTime())) &&
                    startTime.before(meeting.getEndTime()))
                return false;
            if (endTime.after(meeting.getStartTime()) &&
                    (endTime.before(meeting.getEndTime()) || endTime.equals(meeting.getEndTime())))
                return false;
        }
        return true;
    }

    public boolean book(Meeting meeting) {
        if (!isFree(meeting.getStartTime(), meeting.getEndTime())) return false;
        System.out.println(Thread.currentThread().getName() + " Room " + roomNo + " have been booked for meetingId " + meeting.getMeetingId());
        meeting.setBookedAt(new Date());
        meetings.add(meeting);
        return true;
    }

    public void log() {
        System.out.println("Meeting for room no: " + roomNo);
        meetings.stream().sorted(Comparator.comparing(Meeting::getBookedAt)).forEach(meeting -> {
            System.out.println(meeting.toString());
        });
    }
}
