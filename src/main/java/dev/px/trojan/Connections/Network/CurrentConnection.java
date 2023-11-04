package dev.px.trojan.Connections.Network;

import javax.net.ssl.SSLSocket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public abstract class CurrentConnection {

    private SSLSocket socket;
    private int port;

    // Input/Output Streams
    private DataInputStream dataInput;
    private DataOutputStream dataOutput;
    private BufferedReader reader;

    public CurrentConnection(int port) {
        this.port = port;
    }

    public abstract void onConnection();
}
