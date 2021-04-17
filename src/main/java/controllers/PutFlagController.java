package main.java.controllers;

import main.java.models.coordinate.Coordinate;

public interface PutFlagController extends Controller {

    void putFlagInBox(Coordinate coordinate);

    boolean isOpenBox(Coordinate coordinate);

    void end();
}
