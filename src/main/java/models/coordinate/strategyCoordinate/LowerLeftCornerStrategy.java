package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class LowerLeftCornerStrategy implements PositionStrategy {

    @Override
    public List<Coordinate> calculateNumberOfMines() {
        List<Coordinate> coordinatesRound = new ArrayList<>();
        coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW - 1, 1));
        coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW - 1, 2));
        coordinatesRound.add(new Coordinate(ConstantFlat.LAST_POSITION_ROW, 2));
        return coordinatesRound;
    }
}
