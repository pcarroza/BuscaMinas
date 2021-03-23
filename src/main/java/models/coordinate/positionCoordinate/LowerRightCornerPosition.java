package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class LowerRightCornerPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int row = ConstantFlat.LAST_POSITION_ROW;
        int column = ConstantFlat.LAST_POSITION_COLUMN;
        return contextCoordinate.isEqualsCoordinate(new Coordinate(row, column));
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.LOWER_RIGHT_CORNER;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new LowerLeftCornerPosition());
    }
}


