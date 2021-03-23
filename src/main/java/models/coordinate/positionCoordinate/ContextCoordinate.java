package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.CoordinateBuscaMinas;

public class ContextCoordinate {

    private CoordinateBuscaMinas coordinate;

    private static Position position = new UpperRightCornerPosition();

    public ContextCoordinate(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
    }

    public void setCoordinate(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
    }

    private void reset() {
        position = new UpperRightCornerPosition();
    }

    public void changeState(Position positionCoordinate) {
        position = positionCoordinate;
    }

    public PositionCoordinate getPosition() {
        this.findCoordinatePosition();
        PositionCoordinate savePosition = position.getPositionCoordinate();
        this.reset();
        return savePosition;
    }

    public void findCoordinatePosition() {
        position.findCoordinatePosition(this);
    }

    public boolean isEqualsCoordinate(CoordinateBuscaMinas coordinate) {
        return this.coordinate.equals(coordinate);
    }

    public CoordinateBuscaMinas getCoordinate() {
        return this.coordinate;
    }
}
