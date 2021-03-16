package main.java.models.coordinate.positionCoordinate;

import main.java.models.coordinate.CoordinateBuscaMinas;

public class Context {

    private Position position;

    private final CoordinateBuscaMinas coordinate;

    public Context(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
        this.reset();
    }

    private void reset() {
        this.position = new UpperRightCornerPosition();
    }

    public void changeState(Position positionCoordinate) {
        this.position = positionCoordinate;
    }

    public PositionCoordinate getPositionCoordinate() {
        this.execute();
        PositionCoordinate position = this.position.getPositionCoordinate();
        this.reset();
        return position;
    }

    protected void execute() {
        this.position.execute(this);
    }

    public boolean isEqualsCoordinate(CoordinateBuscaMinas coordinate) {
        return this.coordinate.equals(coordinate);
    }

    public CoordinateBuscaMinas getCoordinate() {
        return this.coordinate;
    }
}
