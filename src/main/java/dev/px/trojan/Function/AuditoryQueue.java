package dev.px.trojan.Function;

import dev.px.trojan.Listeners.IInput;
import dev.px.trojan.util.Timer;
import org.jnativehook.keyboard.NativeKeyEvent;

public class AuditoryQueue implements IInput {

    @Override
    public void onKeyIn() {

    }

    @Override
    public void onMouseIn() {

    }

    @Override
    public void onAudioIn() {

    }

    public static AuditoryQueue Get = new AuditoryQueue();
}
