package main.java.models.coordinate.sttateCoordinate;

import main.java.models.flat.ConstantFlat;

public class StateLowerLeftCorner extends State {


    protected StateLowerLeftCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {
        if (context.getRow() == ConstantFlat.LAST_POSITION_COLUMN &&
            context.getColumn() == ConstantFlat.FIRST_POSITION_ROW) {
            context.setStateCoordinate(new StateLeftVertical(context));
            context.whatPosition();
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.LOWER_LEFT_CORNER;
    }
}
