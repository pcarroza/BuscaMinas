package main.java.models.coordinate.positionCoordinate;

public class NullPosition extends Position {

    @Override
    boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        return false;
    }

    @Override
    void generateCoordinatesRound(ContextCoordinate contextCoordinate) {
    }

    @Override
    void changePosition(ContextCoordinate contextCoordinate) {

    }
}
