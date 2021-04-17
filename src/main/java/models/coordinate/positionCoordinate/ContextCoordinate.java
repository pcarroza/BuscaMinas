package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;

import java.util.List;

public class ContextCoordinate {

    private final CoordinateBuscaMinas coordinate;

    private static Position position = new UpperRightCornerPosition();

    public ContextCoordinate(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
    }

    public List<Coordinate> getCoordinatesAround() {
        this.findCoordinatePosition();
        List<Coordinate> coordinatesAroundPosition = position.getCoordinates();
        this.reset();
        return coordinatesAroundPosition;
    }

    protected void findCoordinatePosition() {
        position.findCoordinatePosition(this);
    }

    private void reset() {
        position = new UpperRightCornerPosition();
    }

    protected void changeState(Position positionCoordinate) {
        position = positionCoordinate;
    }

    protected boolean isEqualsCoordinate(CoordinateBuscaMinas coordinate) {
        return this.coordinate.equals(coordinate);
    }

    public CoordinateBuscaMinas getCoordinate() {
        return coordinate.clone();
    }
}
