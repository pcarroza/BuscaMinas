package main.java.models.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class RightUpperCornerStrategy implements PositionStrategy {

    private List<Coordinate> coordinatesRound;

    private static final int FIRST_POSITION = 1;

    private static final int SECOND_POSITION = 2;

    private static final int PENULTIMATE_POSITION = ConstantFlat.LAST_POSITION_COLUMN - 1;

    public RightUpperCornerStrategy() {
        this.coordinatesRound = new ArrayList<>();
        this.coordinatesRound.add(new Coordinate(FIRST_POSITION, PENULTIMATE_POSITION));
        this.coordinatesRound.add(new Coordinate(SECOND_POSITION, PENULTIMATE_POSITION));
        this.coordinatesRound.add(new Coordinate(SECOND_POSITION, ConstantFlat.LAST_POSITION_COLUMN));
    }

    @Override
    public int calculateNumberOfMines() {
        return 0;
    }
}
