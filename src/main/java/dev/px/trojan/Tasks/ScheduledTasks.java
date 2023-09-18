package dev.px.trojan.Tasks;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ScheduledTasks extends ScheduledThreadPoolExecutor {

    public ScheduledTasks(int corePoolSize) {
        super(corePoolSize);
    }

}
