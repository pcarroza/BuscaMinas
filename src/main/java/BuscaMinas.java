package main.java;

import main.java.controllers.LocalController;
import main.java.controllers.Logic;
import main.java.views.View;

public abstract class BuscaMinas {

    private final Logic logic;

    private final View view;

    public BuscaMinas() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    public void run() {
        LocalController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }
}
