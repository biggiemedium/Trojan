package dev.px.trojan.Injection;

import java.io.File;

public abstract class Injection {

    private String directory;
    private File file;

    public Injection(String directory) {
        this.directory = directory;
        this.file = new File(directory);
    }

    public abstract void execute();

    public void delete() {
        try {
            this.file.delete();
        } catch (Exception ignored) {}
    }

    public void deleteCustom(File f) {
        try {
            f.delete();
        } catch (Exception ignored) {}
    }

    public String getDirectory() {
        return this.directory;
    }

    public File getFile() {
        return this.file;
    }
}
