package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class UpperRightCornerPosition implements PositionStrategy {

    private int FIRST_POSITION = 1;

    private static final int SECOND_POSITION = 2;

    private static final int PENULTIMATE_POSITION = ConstantFlat.LAST_POSITION_COLUMN - 1;

    UpperRightCornerPosition(CoordinateBuscaMinas coordinate) {
        this.FIRST_POSITION = coordinate.getRow();
    }

    @Override
    public List<Coordinate> calculateNumberOfMines() {
        List<Coordinate> coordinatesRound = new ArrayList<>();
        coordinatesRound.add(new Coordinate(FIRST_POSITION, PENULTIMATE_POSITION));
        coordinatesRound.add(new Coordinate(SECOND_POSITION, PENULTIMATE_POSITION));
        coordinatesRound.add(new Coordinate(SECOND_POSITION, ConstantFlat.LAST_POSITION_COLUMN));
        return coordinatesRound;
    }
}
