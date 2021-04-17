package main.java.controllers;

import main.java.models.State;
import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public interface PlayController extends OperationController {

    void openBox(Coordinate coordinate);

    void removeFlag(Coordinate coordinate);

    void putFlagInBox(Coordinate coordinate);

    boolean isOpenBox(Coordinate coordinate);

    boolean isMineInBox(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    boolean isFlagInBoard();

    boolean isCompleteBoard();

    Box getBox(Coordinate coordinate);

    void reset();

    void initialize();

    void begin();

    void end();

    void exit();

    void accept(ControllersVisitor controllersVisitor);
}