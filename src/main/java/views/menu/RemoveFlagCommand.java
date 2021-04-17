package main.java.views.menu;

import main.java.controllers.OperationController;

class RemoveFlagCommand extends Command {

    RemoveFlagCommand(String title, OperationController operationController) {
        super(title, operationController);
    }

    @Override
    void execute() {
        boolean error = false;
        do {

        } while (!error);
    }

    @Override
    boolean isActive() {
        return this.operationController.isFlagInBoard();
    }
}
