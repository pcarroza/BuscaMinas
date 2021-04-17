package main.java.controllers.local;

import main.java.controllers.ControllersVisitor;
import main.java.controllers.StartController;
import main.java.models.Game;
import main.java.models.Observer;
import main.java.models.Subject;
import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public class LocalStartController extends LocalOperationController
        implements StartController {

    private final Subject subject;

    public LocalStartController(Observer observer, Game game) {
        super(game);
        subject = new Subject();
        subject.register(observer);
    }

    @Override
    public Box getBox(Coordinate coordinate) {
        return this.game.getBox(coordinate);
    }

    @Override
    public void begin() {
        subject.begin();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
