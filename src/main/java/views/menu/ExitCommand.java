package main.java.views.menu;

import main.java.controllers.PlayController;

class ExitCommand extends Command {

    ExitCommand(String title, PlayController playController) {
        super(title, playController);
    }

    @Override
    void execute() {
        this.operationController.exit();
    }

    @Override
    boolean isActive() {
        return true;
    }
}
