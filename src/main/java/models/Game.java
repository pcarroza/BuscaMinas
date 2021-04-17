package main.java.models;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public class Game {

    private final Board board;

    public Game(Observer observer) {
        board = new Board();
        board.register(observer);
        this.initialize();
    }

    public void openBox(Coordinate coordinate) {
        assert coordinate != null;
        this.board.openBox(coordinate);
    }

    public boolean isOpenBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.board.isOpenBox(coordinate);
    }

    public boolean isBoxOccupied(Coordinate coordinate) {
        assert coordinate != null;
        return this.board.isBoxOccupied(coordinate);
    }

    public boolean isOpenAnyBox() {
        return this.board.isOpenAnyBox();
    }

    public void removeFlag(Coordinate coordinate) {
        assert coordinate != null;
        this.board.removerFlag(coordinate);
    }

    public void putFlagInBox(Coordinate coordinate) {
        assert coordinate != null;
        this.board.putFlagInBox(coordinate);
    }

    public boolean isFlagInFlat() {
        return this.board.isFlagInFlat();
    }

    public boolean isMineInBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.board.isMineInBox(coordinate);
    }

    public boolean isCompleteBoard() {
        return this.board.isCompleteBoard();
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.board.isFlagInBox(coordinate);
    }

    public Box getBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.board.getBox(coordinate);
    }

    public void reset() {
        this.board.reset();
    }

    public void initialize() {

    }

    public void begin() {
    }

    public void end() {
    }

    public void exit() {
    }
}
