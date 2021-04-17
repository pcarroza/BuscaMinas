package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

class LeftVerticalBandPosition extends Position {

    @Override
    boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int column = 1;
        List<CoordinateBuscaMinas> coordinates = new ArrayList<>();
        for (int row = 2; row < ConstantFlat.LAST_POSITION_ROW; row++) {
            coordinates.add(new Coordinate(row, column));
        }
        return coordinates.contains(contextCoordinate.getCoordinate());
    }

    @Override
    void generateCoordinatesRound(ContextCoordinate contextCoordinate) {
    }

    @Override
    void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new CentralPosition());
    }
}
