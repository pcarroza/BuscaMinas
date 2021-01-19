package main.java.models.stateCoordinate;

import main.java.models.EnumStateCoordinate;

public class StateLowerHorizontal extends StateCoordinate {

    protected StateLowerHorizontal(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {

    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.HORIZONTAL_LOWER_BAND;
    }
}
