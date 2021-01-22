package main.java.models.coordinate.stateCoordinate;

public class StateLeftVertical extends State {

    protected StateLeftVertical(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void execute() {

    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return this.state;
    }
}
