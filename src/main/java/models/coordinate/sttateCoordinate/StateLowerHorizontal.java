package main.java.models.coordinate.sttateCoordinate;

public class StateLowerHorizontal extends State {

    protected StateLowerHorizontal(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {

    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.HORIZONTAL_LOWER_BAND;
    }
}
