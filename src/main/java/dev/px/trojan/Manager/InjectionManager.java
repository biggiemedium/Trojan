package dev.px.trojan.Manager;

import dev.px.trojan.Injection.Injection;

import java.util.ArrayList;

public class InjectionManager {

    public ArrayList<Injection> injections;

    public InjectionManager() {
        this.injections = new ArrayList<>();
    }

    public void Add(Injection injection) {
        this.injections.add(injection);
    }

    public void executeAll() {
        for(Injection i : this.injections) {
            i.execute();
        }
    }

    public void executeInjection(Injection injection) {
        injection.execute();
    }

    public void executeInjection(Class<?> clazz) {
        for(Injection i : this.injections) {
            if(i.getClass() == clazz) {
                i.execute();
            }
        }
    }

}
