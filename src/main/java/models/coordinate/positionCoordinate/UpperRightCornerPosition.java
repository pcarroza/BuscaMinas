package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.strategyCoordinate.UpperLeftCornerStrategy;
import main.java.models.flat.ConstantFlat;

class UpperRightCornerPosition extends Position {

    @Override
    boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        int row = ConstantFlat.FIRST_POSITION_ROW;
        int column = ConstantFlat.LAST_POSITION_COLUMN;
        return contextCoordinate.isEqualsCoordinate(new Coordinate(row, column));
    }

    @Override
    void generateCoordinatesRound(ContextCoordinate contextCoordinate) {
        //this.coordinates = new UpperLeftCornerStrategy(contextCoordinate.getCoordinate()).generateCoordinatesRound();
    }

    @Override
    void changePosition(ContextCoordinate contextCoordinate) {
        contextCoordinate.changeState(new LowerRightCornerPosition());
    }
}
