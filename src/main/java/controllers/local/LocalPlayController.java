package main.java.controllers.local;

import main.java.controllers.ControllersVisitor;
import main.java.controllers.PlayController;
import main.java.models.Game;
import main.java.models.Observer;
import main.java.models.Subject;
import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public class LocalPlayController extends LocalOperationController
        implements PlayController {

    private final Subject subject;

    public LocalPlayController(Observer observer, Game game) {
        super(game);
        subject = new Subject();
        subject.register(observer);
    }

    @Override
    public void openBox(Coordinate coordinate) {
        this.game.openBox(coordinate);
    }

    @Override
    public boolean isOpenBox(Coordinate coordinate) {
        return this.game.isOpenBox(coordinate);
    }

    @Override
    public void removeFlag(Coordinate coordinate) {
        this.game.removeFlag(coordinate);
    }

    @Override
    public void putFlagInBox(Coordinate coordinate) {
        this.game.putFlagInBox(coordinate);
    }

    @Override
    public boolean isMineInBox(Coordinate coordinate) {
        return this.game.isMineInBox(coordinate);
    }

    @Override
    public boolean isFlagInBox(Coordinate coordinate) {
        return this.game.isFlagInBox(coordinate);
    }

    @Override
    public boolean isFlagInBoard() {
        return this.game.isFlagInFlat();
    }

    @Override
    public boolean isCompleteBoard() {
        return this.game.isCompleteBoard();
    }

    @Override
    public Box getBox(Coordinate coordinate) {
        return this.game.getBox(coordinate);
    }

    @Override
    public void reset() {
        this.game.reset();
    }

    @Override
    public void initialize() {
        this.subject.initialize();
    }

    @Override
    public void begin() {
        this.subject.begin();
    }

    @Override
    public void end() {
        this.subject.end();
    }

    @Override
    public void exit() {
        this.subject.exit();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
