package main.java.models.stateCoordinate;

import main.java.models.EnumStateCoordinate;

public class ContextCoordinate {

    private StateCoordinate stateCoordinate;

    private final CoordinateBuscaMinas coordinate;

    public ContextCoordinate(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
        this.stateInitial();
    }

    public void setStateCoordinate(StateCoordinate stateCoordinate) {
        this.stateCoordinate = stateCoordinate;
    }

    public EnumStateCoordinate getStateCoordinate() {
        this.whatPosition();
        return this.stateCoordinate.getStateCoordinate();
    }

    void whatPosition() {
        this.stateCoordinate.whatPosition(this);
        this.stateInitial();
    }

    private void stateInitial() {
        this.stateCoordinate = new StateUpperLeftCorner(this);
    }

    public int getRow() {
        return this.coordinate.getRow();
    }

    public int getColumn() {
        return this.coordinate.getColumn();
    }
}
