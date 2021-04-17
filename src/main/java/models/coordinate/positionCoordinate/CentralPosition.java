package main.java.models.coordinate.positionCoordinate;

class CentralPosition extends Position {

    @Override
    boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        return true;
    }

    @Override
    void generateCoordinatesRound(ContextCoordinate contextCoordinate) {
    }

    @Override
    void changePosition(ContextCoordinate contextCoordinate) {
    }
}
