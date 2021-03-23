package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class LowerLeftCornerPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int row = ConstantFlat.LAST_POSITION_ROW;
        int column = ConstantFlat.FIRST_POSITION_COLUMN;
        return contextCoordinate.isEqualsCoordinate(new Coordinate(row, column));
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.LOWER_LEFT_CORNER;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new UpperLeftCornerPosition());
    }
}
