package main.java.models.stateCoordinate;

import main.java.models.flat.ConstantFlat;
import main.java.models.EnumStateCoordinate;

public class StateUpperRightCorner extends StateCoordinate {

    protected StateUpperRightCorner(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {
        if (context.getRow() != ConstantFlat.FIRST_POSITION_ROW &&
            context.getColumn() != ConstantFlat.LAST_POSITION_COLUMN) {
            context.setStateCoordinate(new StateLowerRightCorner(context));
            context.whatPosition();
        }
    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.RIGHT_UPPER_CORNER;
    }
}
