package main.java.views.console;

import main.java.utils.Console;

public class ErrorView {

    private final String error;

    public ErrorView(String error) {
        this.error = error;
    }

    public void write() {
        Console.getInstance().writeln(error);
    }
}
