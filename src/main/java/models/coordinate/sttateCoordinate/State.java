package main.java.models.coordinate.sttateCoordinate;

public abstract class State {

    protected ContextState contextCoordinate;

    protected State(ContextState contextCoordinate) {
        this.contextCoordinate = contextCoordinate;
    }

    public abstract void getPosition(ContextState context);

    public abstract StateCoordinate getStateCoordinate();
}
