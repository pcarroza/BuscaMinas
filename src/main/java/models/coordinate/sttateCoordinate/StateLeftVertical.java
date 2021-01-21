package main.java.models.coordinate.sttateCoordinate;

public class StateLeftVertical extends State {


    protected StateLeftVertical(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {

    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.LEFT_SIDE_BAND;
    }
}
