package dev.px.trojan.Impl.Modules;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Module {

    private String name;
    private boolean active;
    private Priority priority;
    private boolean threaded;

    public Module(String name, boolean active) {
        this.name = name;
        this.active = active;
        this.threaded = true;
    }

    public Module(String name, boolean active, Priority priority) {
        this.name = name;
        this.active = active;
        this.priority = priority;
        this.threaded = true;
    }

    public Module(String name, boolean active, Priority priority, boolean threaded) {
        this.name = name;
        this.active = active;
        this.priority = priority;
        this.threaded = threaded;
    }

    public void run() {
        // will be run through a thread
    }

    public void onDisable() {
        // Will not be run on thread, Only run when thread is ending (Interrupted call)
    }

    public void runNoThread() {
        // Will be run without thread *1 TIME USE WHEN CALLED*
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public enum Priority {
        HIGH,
        NEUTRAL,
        LOW
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface ModuleInterface {
        String name();
        boolean active();
    }
}
