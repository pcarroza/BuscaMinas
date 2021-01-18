package main.java.models.coordinate;

import main.java.models.flat.ConstantFlat;
import main.java.models.EnumStateCoordinate;

public class StateLowerLeftCorner extends StateCoordinate {


    protected StateLowerLeftCorner(ContextCoordinate contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void whatPosition(ContextCoordinate context) {
        if (context.getRow() == ConstantFlat.LAST_POSITION_COLUMN &&
            context.getColumn() == ConstantFlat.FIRST_POSITION_ROW) {
            context.setStateCoordinate(new StateLeftVertical(context));
            context.whatPosition();
        }
    }

    @Override
    public EnumStateCoordinate getStateCoordinate() {
        return EnumStateCoordinate.LOWER_LEFT_CORNER;
    }
}
