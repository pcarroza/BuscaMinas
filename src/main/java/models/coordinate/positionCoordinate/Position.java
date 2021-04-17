package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;

import java.util.List;

abstract class Position {

    protected List<Coordinate> coordinates;

    void findCoordinatePosition(ContextCoordinate contextCoordinate) {
        if (this.isCoordinateInPosition(contextCoordinate)) {
            this.generateCoordinatesRound(contextCoordinate);
        } else {
            this.changePosition(contextCoordinate);
            contextCoordinate.findCoordinatePosition();
        }
    }

    abstract boolean isCoordinateInPosition(ContextCoordinate contextCoordinate);

    abstract void generateCoordinatesRound(ContextCoordinate contextCoordinate);

    abstract void changePosition(ContextCoordinate contextCoordinate);

    List<Coordinate> getCoordinates() {
        return this.coordinates;
    }
}
