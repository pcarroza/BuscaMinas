package main.java.controllers;

import main.java.models.coordinate.Coordinate;

public interface OpenBoxController extends Controller {

    void openBox(Coordinate coordinate);

    boolean isOpenBox(Coordinate coordinate);

    boolean isMineInBox(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    boolean isCompleteBoard();

    void end();

    void exit();
}
