package dev.px.trojan.Impl.Modules.UserInfo;

import dev.px.trojan.Impl.Modules.Module;

public class UserInfoModule extends Module {

    public UserInfoModule() {
        super("UserInfo", true, Priority.LOW, ThreadMode.INTERVAL); // Not threaded. We will update in intervals
    }

    @Override
    public void run() {

    }

    @Override
    public void runNoThread() {

    }

    @Override
    public void onDisable() {

    }
}
