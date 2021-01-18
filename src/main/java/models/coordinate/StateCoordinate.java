package main.java.models.coordinate;

import main.java.models.EnumStateCoordinate;

public abstract class StateCoordinate {

    protected ContextCoordinate contextCoordinate;

    protected StateCoordinate(ContextCoordinate contextCoordinate) {
        this.contextCoordinate = contextCoordinate;
    }

    public abstract void whatPosition(ContextCoordinate context);

    public abstract EnumStateCoordinate getStateCoordinate();
}
