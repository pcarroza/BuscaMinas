package main.java.models.coordinate.stateCoordinate;

public class StateLowerHorizontal extends State {

    protected StateLowerHorizontal(ContextState contextCoordinate) {
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
