package main.java.models.positionCoordinate;

import main.java.models.EnumStateCoordinate;

public class StateLeftVertical extends StateCoordinate {


    protected StateLeftVertical(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {

    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.LEFT_SIDE_BAND;
    }
}
