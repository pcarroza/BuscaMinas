package main.java.models.stateCoordinate;

import main.java.models.flat.ConstantFlat;
import main.java.models.EnumStateCoordinate;

public class StateUpperLeftCorner extends StateCoordinate {

    protected StateUpperLeftCorner(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {
        if (context.getRow() != ConstantFlat.FIRST_POSITION_ROW &&
            context.getColumn() != ConstantFlat.FIRST_POSITION_ROW) {
            context.setStateCoordinate(new StateUpperRightCorner(context));
            context.whatPosition();
        }
    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.LOWER_LEFT_CORNER;
    }
}




