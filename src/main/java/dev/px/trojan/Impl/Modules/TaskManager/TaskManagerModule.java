package dev.px.trojan.Impl.Modules.TaskManager;

import dev.px.trojan.Impl.Modules.Module;

public class TaskManagerModule extends Module {

    /**
     * We are going to need to add
     * -taskmanager checker
     * -Wireshark checker
     * -AngryIPScanner checker
     *
     */
    public TaskManagerModule() {
        super("TaskManager Checker", true, Priority.HIGH, true);
    }

    // @TODO: check if taskmanager is running - if running disable program (Unless program rat is hidden in is running)
    @Override
    public void run() {

    }
}
