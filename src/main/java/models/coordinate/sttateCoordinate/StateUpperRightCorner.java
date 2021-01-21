package main.java.models.coordinate.sttateCoordinate;

import main.java.models.flat.ConstantFlat;

public class StateUpperRightCorner extends State {

    protected StateUpperRightCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {
        if (context.getRow() != ConstantFlat.FIRST_POSITION_ROW &&
            context.getColumn() != ConstantFlat.LAST_POSITION_COLUMN) {
            context.setStateCoordinate(new StateLowerRightCorner(context));
            context.whatPosition();
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.RIGHT_UPPER_CORNER;
    }
}
