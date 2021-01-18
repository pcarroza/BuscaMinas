package main.java.models.coordinate;

import main.java.models.EnumStateCoordinate;

public class StateUpperHorizontal extends StateCoordinate {

    protected StateUpperHorizontal(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {

    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.HORIZONTAL_UPPER_BAND;
    }
}
