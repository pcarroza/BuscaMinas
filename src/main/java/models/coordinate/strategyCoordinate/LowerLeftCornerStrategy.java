package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class LowerLeftCornerStrategy implements PositionStrategy {

    private List<Coordinate> coordinatesRound;

    public LowerLeftCornerStrategy() {
        this.coordinatesRound = new ArrayList<>();
        this.coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW - 1, 1));
        this.coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW - 1, 2));
        this.coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW, 2));
    }

    @Override
    public int calculateNumberOfMines() {
        return 0;
    }
}
