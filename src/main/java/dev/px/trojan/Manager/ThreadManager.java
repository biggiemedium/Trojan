package dev.px.trojan.Manager;

import dev.px.trojan.Impl.Handler;

import java.util.concurrent.*;

public class ThreadManager {

    private ScheduledExecutorService mainThread;
    private Thread backgroundThread;

    public ThreadManager() {
        this.mainThread = Executors.newScheduledThreadPool(1);
        //this.mainThread.schedule()
        this.backgroundThread = new Thread(() -> {

        }, "Background Thread");
    }

    public void syncThreads() {
        try {
            if(!mainThread.isShutdown()) {

            }
            this.backgroundThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ThreadManager build() {
        return this;
    }

    public ScheduledExecutorService getMainThread() {
        return mainThread;
    }

    public Thread getBackgroundThread() {
        return this.backgroundThread;
    }
}
