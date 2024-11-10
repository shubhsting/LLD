package MULTITHREADING.MEETING_SCHEDULER.model;

import MULTITHREADING.MEETING_SCHEDULER.model.enums.ActorType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Actor {
    private ActorType actorType;
    private String value;
}
