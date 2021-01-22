package main.java.models.coordinate.stateCoordinate;

public class StateRightVertical extends State {

    protected StateRightVertical(ContextState contextCoordinate) {
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
