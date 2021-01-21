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
        this.board.remover(coordinate);
    }

    public void putFlag(Coordinate coordinate) {
        this.board.putFlag(coordinate);
    }

    public boolean isEmpty(Coordinate coordinate) {
        return this.board.isEmpty(coordinate);
    }

    public boolean isMineBox(Coordinate coordinate) {
        return this.board.isMineBox(coordinate);
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        return this.board.isFlagInBox(coordinate);
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


