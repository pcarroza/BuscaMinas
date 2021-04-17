package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.coordinate.positions.CoordinateZone;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class HorizontalLowerBandPosition extends Position {

    @Override
    boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        List<CoordinateBuscaMinas> coordinates = new ArrayList<>();
        for (int column = 2; column < ConstantFlat.LAST_POSITION_COLUMN - 1; column++) {
            int row = ConstantFlat.LAST_POSITION_ROW;
            coordinates.add(new Coordinate(row, column));
        }
        return coordinates.contains(contextCoordinate.getCoordinate());
    }

    @Override
    void generateCoordinatesRound(ContextCoordinate contextCoordinate) {
    }

    @Override
    void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new RightVerticalPosition());
    }
}
