package main.java.models.coordinate.sttateCoordinate;

public class StateUpperHorizontal extends State {

    protected StateUpperHorizontal(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {

    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.HORIZONTAL_UPPER_BAND;
    }
}
