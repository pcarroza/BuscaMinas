package main.java.controllers;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public interface Controller {

    void openBox(Coordinate coordinate);

    boolean isBoxOccupied(Coordinate coordinate);

    boolean isOpenAnyBox();

    boolean isOpenBox(Coordinate coordinate);

    void putFlagInBox(Coordinate coordinate);

    void removeFlag(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    boolean isFlagInBoard();

    boolean isCompleteBoard();

    boolean isMineInBox(Coordinate coordinate);

    Box getBox(Coordinate coordinate);

    void reset();

    void initialize();

    void begin();

    void end();

    void exit();
}
