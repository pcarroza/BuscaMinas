package main.java.models.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class LowerRightCornerStrategy implements PositionStrategy {

    private List<Coordinate> coordinatesRound;

    public LowerRightCornerStrategy() {
        this.coordinatesRound = new ArrayList<>();
        this.coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW - 1,
                                              ConstantFlat.LAST_POSITION_COLUMN - 1));
        this.coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW,
                                                 ConstantFlat.LAST_POSITION_COLUMN - 1));
        this.coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW - 1,
                                                      ConstantFlat.LAST_POSITION_COLUMN));
    }
    @Override
    public int calculateNumberOfMines() {
        return 0;
    }
}
