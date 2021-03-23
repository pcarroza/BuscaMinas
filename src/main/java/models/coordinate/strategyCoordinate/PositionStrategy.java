package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;

import java.util.List;

public interface PositionStrategy {

    List<Coordinate> calculateNumberOfMines();

}
