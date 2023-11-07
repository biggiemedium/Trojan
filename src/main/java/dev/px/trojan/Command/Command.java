package dev.px.trojan.Command;

public abstract class Command {

    private String alias;
    private String[] syntax;

    public Command(String alias, String[] syntax) {
        this.alias = alias;
        this.syntax = syntax;
    }

    public void sendMessage(String text) {

    }
}
