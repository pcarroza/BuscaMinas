package main.java.controllers.local;

import main.java.controllers.ContinueController;
import main.java.controllers.ControllersVisitor;
import main.java.models.Game;
import main.java.models.Observer;
import main.java.models.Subject;

public class LocalContinueController extends LocalOperationController
        implements ContinueController {

    private final Subject subject;

    public LocalContinueController(Observer observer, Game game) {
        super(game);
        subject = new Subject();
        subject.register(observer);
    }

    @Override
    public void reset() {
        this.game.reset();
        subject.initialize();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
