package MULTITHREADING.MEETING_SCHEDULER;

import MULTITHREADING.MEETING_SCHEDULER.model.Actor;
import MULTITHREADING.MEETING_SCHEDULER.model.enums.ActorType;
import MULTITHREADING.MEETING_SCHEDULER.model.Meeting;
import MULTITHREADING.MEETING_SCHEDULER.scheduler.MeetingScheduler;
import MULTITHREADING.MEETING_SCHEDULER.strategy.CapacityBasedScheduleStrategy;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MeetingScheduler scheduler = new MeetingScheduler(new CapacityBasedScheduleStrategy());
        Date start = new Date();
        List<Actor> list = Arrays.asList(new Actor(ActorType.EMAIL, "one"),
                new Actor(ActorType.EMAIL, "two"));
        scheduler.schedule(new Meeting("Meeting 1", "test meeting", "1", list, start, new Date(start.getTime() + 2 * 3600 * 1000)));
        List<Actor> list2 = Arrays.asList(new Actor(ActorType.EMAIL, "one"),
                new Actor(ActorType.EMAIL, "two"),
                new Actor(ActorType.EMAIL, "three"),
                new Actor(ActorType.EMAIL, "four"));
        scheduler.schedule(new Meeting("Meeting 2", "test meeting", "2", list2, start, new Date(start.getTime() + 2 * 3600 * 1000)));

        List<Actor> list3 = Arrays.asList(new Actor(ActorType.EMAIL, "one"),
                new Actor(ActorType.EMAIL, "two"),
                new Actor(ActorType.EMAIL, "three"),
                new Actor(ActorType.EMAIL, "four"),
                new Actor(ActorType.EMAIL, "five"),
                new Actor(ActorType.EMAIL, "six"),
                new Actor(ActorType.EMAIL, "seven"),
                new Actor(ActorType.EMAIL, "eight")
        );
        scheduler.schedule(new Meeting("Meeting 3", "test meeting", "3", list3, start, new Date(start.getTime() + 2 * 3600 * 1000)));

        Thread.sleep(5000);
        scheduler.log();
    }
}
