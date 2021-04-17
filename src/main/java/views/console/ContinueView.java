package main.java.views.console;

import main.java.controllers.ContinueController;

public class ContinueView {

    public void interact(ContinueController continueController) {
        new ContinueOptionReader(continueController).read();
    }
}
