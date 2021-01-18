package main.java.models.coordinate;

import main.java.models.EnumStateCoordinate;

public class StateRightVertical extends StateCoordinate {

    protected StateRightVertical(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {

    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.RIGHT_SIDE_BAND;
    }
}
