package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class LowerLeftCornerPosition extends Position {

    @Override
    public boolean isContained(Context context) {
        int row = ConstantFlat.LAST_POSITION_ROW;
        int column = ConstantFlat.FIRST_POSITION_COLUMN;
        return context.isEqualsCoordinate(new Coordinate(row, column));
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.LOWER_LEFT_CORNER;
    }

    @Override
    public void changePosition(Context context) {
        context.changeState(new UpperLeftCornerPosition());
    }
}
