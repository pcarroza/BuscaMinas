package main.java.models.coordinate;

import main.java.models.flat.ConstantFlat;
import main.java.models.EnumStateCoordinate;

public class StateLowerRightCorner extends StateCoordinate {

    protected StateLowerRightCorner(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {
        if (context.getRow() != ConstantFlat.LAST_POSITION_COLUMN &&
            context.getColumn() != ConstantFlat.LAST_POSITION_COLUMN) {
            context.setStateCoordinate(new StateLowerLeftCorner(context));
            context.whatPosition();
        }
    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.LOWER_RIGHT_CORNER;
    }
}


