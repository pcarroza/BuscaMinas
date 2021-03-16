package main.java.views.console;

import main.java.controllers.local.LocalController;
import main.java.views.View;

public class ConsoleView extends View {

    @Override
    public void interact(LocalController controller) {
        System.out.println("ConsoleView");
    }
}
