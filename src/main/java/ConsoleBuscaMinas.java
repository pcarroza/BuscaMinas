package main.java;

import main.java.views.View;
import main.java.views.console.ConsoleView;

public class ConsoleBuscaMinas extends BuscaMinas {

    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleBuscaMinas();
    }
}
