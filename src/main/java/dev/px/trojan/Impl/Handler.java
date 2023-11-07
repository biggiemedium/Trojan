package dev.px.trojan.Impl;

import dev.px.trojan.Manager.ConnectionManager;
import dev.px.trojan.Manager.ThreadManager;
import me.zero.alpine.fork.bus.EventBus;
import me.zero.alpine.fork.bus.EventManager;

public class Handler {

    private ConnectionManager connectionManager;
    private ThreadManager threadManager;
    private EventBus eventManager = new EventManager();

    public Handler() {
        this.connectionManager = new ConnectionManager();
        this.threadManager = new ThreadManager().build();
        if(eventManager == null) {
            this.eventManager = new EventManager();
        }
    }

    public ConnectionManager getConnectionManager() {
        return connectionManager;
    }

    public ThreadManager getThreadManager() {
        return threadManager;
    }

    public EventBus getEventManager() {
        return eventManager;
    }
}
