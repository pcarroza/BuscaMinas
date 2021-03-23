package main.java.controllers.local;

import main.java.controllers.Controller;
import main.java.models.Game;
import main.java.models.State;
import main.java.models.coordinate.Coordinate;

public class LocalController implements Controller {

    protected Game game;

    public LocalController(Game game) {
        this.game = game;
    }

    @Override
    public void openBox(Coordinate coordinate) {
        this.game.openBox(coordinate);
    }

    @Override
    public void remove(Coordinate coordinate) {
        this.game.remove(coordinate);
    }

    @Override
    public void putFlagInBox(Coordinate coordinate) {
        this.game.putFlagInBox(coordinate);
    }

    @Override
    public boolean isOpenBox(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean isMineInBox(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean isFlagInBox(Coordinate coordinate) {
        return false;
    }

    @Override
    public State getState() {
        return null;
    }

    @Override
    public void setStateInitial() {

    }

    @Override
    public void setStateInGame() {

    }

    @Override
    public void setStateFinal() {

    }

    @Override
    public void setStateExit() {

    }
}
