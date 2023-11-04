package dev.px.trojan.Impl;

import dev.px.trojan.Manager.ConnectionManager;
import dev.px.trojan.Manager.ThreadManager;

public class Handler {

    private ConnectionManager connectionManager;

    private ThreadManager threadManager;

    public Handler() {
        this.connectionManager = new ConnectionManager();
        this.threadManager = new ThreadManager().build();
    }

    public ConnectionManager getConnectionManager() {
        return connectionManager;
    }

}
