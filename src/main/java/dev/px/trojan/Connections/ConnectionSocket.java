package dev.px.trojan.Connections;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class ConnectionSocket {

    private Socket socket;
    private int port;

    // Input/Output Streams
    private DataInputStream dataInput;
    private DataOutputStream dataOutput;
    private BufferedReader reader;

    private String input;

    public ConnectionSocket(int port) throws Exception {
        this.port = port;
        this.socket = new Socket("LocalHost", 4200);
        this.input = "";

        this.dataInput = new DataInputStream(socket.getInputStream());
        this.dataOutput = new DataOutputStream(socket.getOutputStream());
        this.reader = new BufferedReader(new InputStreamReader(System.in));

       while(true) {
           if(input.equalsIgnoreCase("Stop")) {
               break;
           }

       }

        dataOutput.close();
        socket.close();
    }


    public void sendInformation(String data) {

    }
}
