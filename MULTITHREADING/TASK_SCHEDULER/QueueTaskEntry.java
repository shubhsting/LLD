package MULTITHREADING.TASK_SCHEDULER;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class QueueTaskEntry {
    @NonNull
    CalculationTask message;
    @NonNull
    Long timeEpoch;
    Long intervalInMs;
}
