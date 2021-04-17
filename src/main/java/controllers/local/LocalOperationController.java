package main.java.controllers.local;

import main.java.controllers.OperationController;
import main.java.controllers.ControllersVisitor;
import main.java.models.Game;

public abstract class LocalOperationController extends LocalController
    implements OperationController {

    public LocalOperationController(Game game) {
        super(game);
    }

    @Override
    public abstract void accept(ControllersVisitor controllersVisitor);
}
