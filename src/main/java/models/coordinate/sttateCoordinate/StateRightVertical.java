package main.java.models.coordinate.sttateCoordinate;

public class StateRightVertical extends State {

    protected StateRightVertical(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {

    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.RIGHT_SIDE_BAND;
    }
}
