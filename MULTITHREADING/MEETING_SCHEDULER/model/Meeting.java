package MULTITHREADING.MEETING_SCHEDULER.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class Meeting {
    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private String meetingId;
    @NonNull
    private List<Actor> participants;
    @NonNull
    private Date startTime;
    @NonNull
    private Date endTime;
    @Setter
    private Date bookedAt;

    @Override
    public String toString() {
        return meetingId + " - " + title;
    }
}
