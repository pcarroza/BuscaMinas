package main.java.models.coordinate.stateCoordinate;

import main.java.models.coordinate.CoordinateBuscaMinas;

public class ContextState {

    private State stateCoordinate;

    private final CoordinateBuscaMinas coordinate;

    public ContextState(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
        this.reset();
    }

    private void reset() {
        this.stateCoordinate = new StateUpperLeftCorner(this);
    }

    public void setStateCoordinate(State stateCoordinate) {
        this.stateCoordinate = stateCoordinate;
    }

    public StateCoordinate getStateCoordinate() {
        this.stateCoordinate.execute();
        StateCoordinate state = this.stateCoordinate.getStateCoordinate();
        this.reset();
        return state;
    }

    public boolean isEquals(CoordinateBuscaMinas coordinate) {
        return this.coordinate.equals(coordinate);
    }

    public CoordinateBuscaMinas getCoordinate() {
        return this.coordinate;
    }
}
