package main.java.views;

import main.java.utils.IO;

public enum Message {

    ONE_SPACE(" "),
    TWO_SPACE_INTERSPERSED("  "),
    JUMP_LINE("");

    private final String designLabel;

    Message(String text) {
        this.designLabel = text;
    }

    public void write(String text) {
        IO.getInstance().write(this.designLabel + text);
    }

    public void write() {
        IO.getInstance().write(this.designLabel);
    }

    public void writeln() {
        IO.getInstance().writeln();
    }
}
