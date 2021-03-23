package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class UpperLeftCornerPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int row = ConstantFlat.FIRST_POSITION_ROW;
        return contextCoordinate.isEqualsCoordinate(new Coordinate(row, row));
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.UPPER_LEFT_CORNER;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new HorizontalUpperBandPosition());
    }
}




