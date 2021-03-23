package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class UpperRightCornerPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int row = ConstantFlat.FIRST_POSITION_ROW;
        int column = ConstantFlat.LAST_POSITION_COLUMN;
        return contextCoordinate.isEqualsCoordinate(new Coordinate(row, column));
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.RIGHT_UPPER_CORNER;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new LowerRightCornerPosition());
    }
}
