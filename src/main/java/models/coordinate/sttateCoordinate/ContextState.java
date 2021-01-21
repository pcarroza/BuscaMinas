package main.java.models.coordinate.sttateCoordinate;

import main.java.models.coordinate.CoordinateBuscaMinas;

public class ContextState {

    private State stateCoordinate;

    private final CoordinateBuscaMinas coordinate;

    public ContextState(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
        this.stateInitial();
    }

    public void setStateCoordinate(State stateCoordinate) {
        this.stateCoordinate = stateCoordinate;
    }

    public StateCoordinate getStateCoordinate() {
        this.whatPosition();
        return this.stateCoordinate.getStateCoordinate();
    }

    void whatPosition() {
        this.stateCoordinate.getPosition(this);
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
