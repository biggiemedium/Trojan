package dev.px.trojan.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class NetworkHandler {

    public static String getIPAddress() {
        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
            String ip = bufferedReader.readLine();

            return ip;
        } catch (Exception ignore) {}
        return null;
    }

    public static boolean isConnectionStable() {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            connection.getInputStream().close();
            return true;
        } catch (IOException e) {e.printStackTrace();}

        return false;
    }
}
