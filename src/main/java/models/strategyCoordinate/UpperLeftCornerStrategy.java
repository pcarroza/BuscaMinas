package main.java.models.strategyCoordinate;

import main.java.models.coordinate.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class UpperLeftCornerStrategy implements PositionStrategy {

    private final List<Coordinate> coordinatesRound;

    private static final int FIRST_POSITION = 1;

    private static final int SECOND_POSITION = 2;

    public UpperLeftCornerStrategy() {
        this.coordinatesRound = new ArrayList<>();
        /*this.coordinatesRound.add(new Coordinate(FIRST_POSITION, SECOND_POSITION));
        this.coordinatesRound.add(new Coordinate(SECOND_POSITION, FIRST_POSITION));
        this.coordinatesRound.add(new Coordinate(SECOND_POSITION, SECOND_POSITION));*/
    }

    @Override
    public int calculateNumberOfMines() {
        return 0;
    }
}
