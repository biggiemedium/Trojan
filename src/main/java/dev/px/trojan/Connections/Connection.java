package dev.px.trojan.Connections;

import dev.px.trojan.Util.Listeners.IConnection;

public class Connection implements IConnection {

    private int port;

    public Connection(int port) {
        this.port = port;
    }

    @Override
    public void onConnection() {}

    @Override
    public void connect() {}

    @Override
    public void disconnect() {}
}
