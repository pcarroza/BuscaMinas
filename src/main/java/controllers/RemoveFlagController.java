package main.java.controllers;

import main.java.models.coordinate.Coordinate;

public interface RemoveFlagController extends Controller {

    void removeFlag(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    boolean isFlagInBoard();
}
