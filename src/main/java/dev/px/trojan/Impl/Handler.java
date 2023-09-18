package dev.px.trojan.Impl;

import dev.px.trojan.Connections.ConnectionSocket;
import dev.px.trojan.Util.Directorys;
import dev.px.trojan.Util.OSCheckerJ;

public class Handler {

    private ConnectionManager connectionManager;
    private FileManager fileManager;

    public Handler() {
        this.connectionManager = new ConnectionManager();
        this.fileManager = new FileManager();
    }

}
