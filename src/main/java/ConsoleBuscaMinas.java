package main.java;

import main.java.controllers.local.logic.LocalLogic;
import main.java.views.View;
import main.java.views.console.ConsoleView;

public class ConsoleBuscaMinas extends BuscaMinas {

    @Override
    protected Logic createLogic() {
        return new LocalLogic();
    }

    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleBuscaMinas().run();
    }
}
