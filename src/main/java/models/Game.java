package main.java.models;

import main.java.models.coordinate.Coordinate;

public class Game {

    private final Board board;

    private State state;

    public Game() {
        board = new Board();
        state = State.INITIAL;
    }

    public void openBox(Coordinate coordinate) {
        assert coordinate != null;
        this.board.openBox(coordinate);
    }

    public void remove(Coordinate coordinate) {
        assert coordinate != null;
        this.board.removerFlag(coordinate);
    }

    public void putFlagInBox(Coordinate coordinate) {
        this.board.putFlagInBox(coordinate);
    }

    public boolean isOpenBox(Coordinate coordinate) {
        return this.board.isOpenBox(coordinate);
    }

    public boolean isMineInBox(Coordinate coordinate) {
        return this.board.isMineInBox(coordinate);
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        return this.board.isFlagInBox(coordinate);
    }

    public State getState() {
        return this.state;
    }

    public void setStateInitial() {
        this.state = State.INITIAL;
    }

    public void setStateInGame() {
        this.state = State.IN_GAME;
    }

    public void setStateFinal() {
        this.state = State.FINAL;
    }

    public void setStateExit() {
        this.state = State.EXIT;
    }
}


