package main.java.views.menu;

import main.java.controllers.OperationController;

abstract class Command {

    protected OperationController operationController;

    private final String title;

    protected Command(String title, OperationController operationController) {
        this.operationController = operationController;
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    abstract void execute();

    abstract boolean isActive();
}
