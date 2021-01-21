package main.java.models.coordinate.sttateCoordinate;

import main.java.models.flat.ConstantFlat;

public class StateLowerRightCorner extends State {

    protected StateLowerRightCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {
        if (context.getRow() != ConstantFlat.LAST_POSITION_COLUMN &&
            context.getColumn() != ConstantFlat.LAST_POSITION_COLUMN) {
            context.setStateCoordinate(new StateLowerLeftCorner(context));
            context.whatPosition();
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.LOWER_RIGHT_CORNER;
    }
}


