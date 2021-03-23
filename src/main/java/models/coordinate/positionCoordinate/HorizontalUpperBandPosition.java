package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class HorizontalUpperBandPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        List<CoordinateBuscaMinas> coordinates = new ArrayList<>();
        for (int column = 2; column < ConstantFlat.LAST_POSITION_COLUMN - 1; column++) {
            int row = ConstantFlat.FIRST_POSITION_ROW;
            coordinates.add(new Coordinate(row, column));
        }
        return coordinates.contains(contextCoordinate.getCoordinate());
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.HORIZONTAL_UPPER_BAND;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new HorizontalLowerBandPosition());
    }
}
