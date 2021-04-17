package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;

import java.util.ArrayList;
import java.util.List;

public class UpperLeftCornerStrategy {

    private final int FIRST_POSITION;

    private final int SECOND_POSITION;

    public UpperLeftCornerStrategy(CoordinateBuscaMinas coordinate) {
        this.FIRST_POSITION = coordinate.getRow();
        this.SECOND_POSITION = coordinate.getColumn() + 1;
    }

    public List<CoordinateBuscaMinas> generateCoordinatesRound() {
        List<CoordinateBuscaMinas> coordinatesRound = new ArrayList<>();
        coordinatesRound.add(new Coordinate(FIRST_POSITION, SECOND_POSITION));
        coordinatesRound.add(new Coordinate(SECOND_POSITION, FIRST_POSITION));
        coordinatesRound.add(new Coordinate(SECOND_POSITION, SECOND_POSITION));
        return coordinatesRound;
    }
}
