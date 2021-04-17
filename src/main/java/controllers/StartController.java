package main.java.controllers;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.Box;

public interface StartController extends OperationController {

    Box getBox(Coordinate coordinate);

    void begin();
}
