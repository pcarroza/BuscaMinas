package main.java.controllers.local;

import main.java.controllers.Controller;
import main.java.models.Game;
import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public abstract class LocalController implements Controller {

    protected Game game;

    public LocalController(Game game) {
        this.game = game;
    }

    public void openBox(Coordinate coordinate) {
        assert false;
    }

    public boolean isOpenBox(Coordinate coordinate) {
        assert false;
        return false;
    }

    public boolean isBoxOccupied(Coordinate coordinate) {
        assert false;
        return false;
    }

    public boolean isOpenAnyBox() {
        assert false;
        return false;
    }

    public void putFlagInBox(Coordinate coordinate) {
        assert false;
    }

    public void removeFlag(Coordinate coordinate) {
        assert false;
    }

    public boolean isMineInBox(Coordinate coordinate) {
        assert false;
        return false;
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        assert false;
        return false;
    }

    public boolean isFlagInBoard() {
        assert false;
        return false;
    }

    public boolean isCompleteBoard() {
        assert false;
        return false;
    }

    public Box getBox(Coordinate coordinate) {
        assert false;
        return null;
    }

    public void reset() {
        assert false;
    }

    public void initialize() {
        assert false;
    }

    public void begin() {
        assert false;
    }

    public void end() {
        assert false;
    }

    public void exit() {
        assert false;
    }
}
