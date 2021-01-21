package main.java.models.coordinate.sttateCoordinate;

import main.java.models.flat.ConstantFlat;

public class StateUpperLeftCorner extends State {

    protected StateUpperLeftCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void getPosition(ContextState context) {
        if (context.getRow() != ConstantFlat.FIRST_POSITION_ROW &&
            context.getColumn() != ConstantFlat.FIRST_POSITION_ROW) {
            context.setStateCoordinate(new StateUpperRightCorner(context));
            context.whatPosition();
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return StateCoordinate.LOWER_LEFT_CORNER;
    }
}




