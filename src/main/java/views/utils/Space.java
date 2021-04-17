package main.java.views.utils;

import main.java.utils.Console;

public enum Space {

    TWO_SPACE_INTERSPERSED("  "),
    JUMP_LINE(""),
    ONE_SPACE(" ");

    private final String title;

    Space(String text) {
        this.title = text;
    }

    public void write(String text) {
        Console.getInstance().write(this.title + text);
    }

    public void write() {
        Console.getInstance().write(this.title);
    }

    public void writeln() {
        Console.getInstance().writeln();
    }
}
