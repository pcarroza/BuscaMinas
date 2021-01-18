package main.java.views.console;

import main.java.utils.IO;

public enum MessageView {

    ONE_SPACE(" "),
    TWO_SPACE_INTERSPERSED("  "),
    JUMP_LINE("");

    private final String designLabel;

    MessageView(String text) {
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
