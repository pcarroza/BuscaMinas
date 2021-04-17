package main.java;

import main.java.controllers.OperationController;
import main.java.views.View;

public abstract class BuscaMinas {

    private final Logic logic;

    private final View view;

    protected BuscaMinas() {
        this.logic = this.createLogic();
        this.view = this.createView();
    }

    protected abstract Logic createLogic();

    protected abstract View createView();

    public void run() {
        OperationController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }
}
