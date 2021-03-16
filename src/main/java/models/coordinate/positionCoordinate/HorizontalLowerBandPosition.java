package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class HorizontalLowerBandPosition extends Position {

    @Override
    public boolean isContained(Context context) {
        List<CoordinateBuscaMinas> coordinates = new ArrayList<>();
        for (int column = 2; column < ConstantFlat.LAST_POSITION_COLUMN - 1; column++) {
            int row = ConstantFlat.LAST_POSITION_ROW;
            coordinates.add(new Coordinate(row, column));
        }
        return coordinates.contains(context.getCoordinate());
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.HORIZONTAL_LOWER_BAND;
    }

    @Override
    public void changePosition(Context context) {
        context.changeState(new RightVerticalPosition());
    }
}
