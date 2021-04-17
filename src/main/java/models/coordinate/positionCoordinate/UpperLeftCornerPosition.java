package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

class UpperLeftCornerPosition extends Position {

    @Override
    boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int row = ConstantFlat.FIRST_POSITION_ROW;
        return contextCoordinate.isEqualsCoordinate(new Coordinate(row, row));
    }

    @Override
    void generateCoordinatesRound(ContextCoordinate contextCoordinate) {
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new HorizontalUpperBandPosition());
    }
}




