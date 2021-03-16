package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class UpperLeftCornerPosition extends Position {

    @Override
    public boolean isContained(Context context) {
        int row = ConstantFlat.FIRST_POSITION_ROW;
        return context.isEqualsCoordinate(new Coordinate(row, row));
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.UPPER_LEFT_CORNER;
    }

    @Override
    public void changePosition(Context context) {
        context.changeState(new HorizontalUpperBandPosition());
    }
}




