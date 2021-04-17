package main.java.views.console;

import main.java.controllers.*;
import main.java.views.View;

public class ConsoleView implements View {

    private final StartView startView;

    private final PlayView playView;

    private final ContinueView continueView;

    public ConsoleView() {
        startView = new StartView();
        playView = new PlayView();
        continueView = new ContinueView();
    }

    @Override
    public void interact(OperationController operationController) {
        operationController.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) {
        this.playView.interact(playController);
    }

    @Override
    public void visit(ContinueController continueController) {
        this.continueView.interact(continueController);
    }
}
