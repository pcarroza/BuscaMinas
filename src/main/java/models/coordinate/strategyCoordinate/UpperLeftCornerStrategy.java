package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class UpperLeftCornerStrategy implements PositionStrategy {

    private static final int FIRST_POSITION = 1;

    private static final int SECOND_POSITION = 2;

    @Override
    public List<Coordinate> calculateNumberOfMines() {
        List<Coordinate> coordinatesRound = new ArrayList<>();
        coordinatesRound.add(new Coordinate(FIRST_POSITION, SECOND_POSITION));
        coordinatesRound.add(new Coordinate(SECOND_POSITION, FIRST_POSITION));
        coordinatesRound.add(new Coordinate(SECOND_POSITION, SECOND_POSITION));
        return coordinatesRound;
    }
}
