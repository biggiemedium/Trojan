package dev.px.trojan.Connections.Network;

import dev.px.trojan.Connections.Connection;

import javax.net.ssl.SSLSocket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class CurrentConnection extends Connection {

    private SSLSocket socket;
    private int port;

    // Input/Output Streams
    private DataInputStream dataInput;
    private DataOutputStream dataOutput;
    private BufferedReader reader;

    public CurrentConnection(int port) {
        super(port);
        this.port = port;
    }


}
