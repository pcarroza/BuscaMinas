package main.java.controllers;

import main.java.models.State;
import main.java.models.coordinate.Coordinate;

public interface Controller {

    void openBox(Coordinate coordinate);

    void remove(Coordinate coordinate);

    void putFlagInBox(Coordinate coordinate);

    boolean isOpenBox(Coordinate coordinate);

    boolean isMineInBox(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    State getState();

    void setStateInitial();

    void setStateInGame();

    void setStateFinal();

    void setStateExit();
}
