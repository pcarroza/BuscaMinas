package main.java.models.coordinate.stateCoordinate;

public abstract class State {

    protected ContextState context;

    protected StateCoordinate state;

    protected State(ContextState contextCoordinate) {
        this.context = contextCoordinate;
    }

    public abstract void execute();

    public abstract StateCoordinate getStateCoordinate();
}
