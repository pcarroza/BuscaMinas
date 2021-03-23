package main.java.models.coordinate.positionCoordinate;

public abstract class Position {

    protected PositionCoordinate state;

    protected void findCoordinatePosition(ContextCoordinate contextCoordinate) {
        if (this.isCoordinateInPosition(contextCoordinate)) {
            this.toAssignPosition();
        } else {
            this.changePosition(contextCoordinate);
            contextCoordinate.findCoordinatePosition();
        }
    }

    public abstract boolean isCoordinateInPosition(ContextCoordinate contextCoordinate);

    public abstract void toAssignPosition();

    public abstract void changePosition(ContextCoordinate contextCoordinate);

    public PositionCoordinate getPositionCoordinate() {
        return this.state;
    }
}
