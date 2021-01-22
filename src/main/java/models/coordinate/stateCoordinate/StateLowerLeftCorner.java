package main.java.models.coordinate.stateCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class StateLowerLeftCorner extends State {

    private final int row = ConstantFlat.LAST_POSITION_ROW;

    private final int column = ConstantFlat.FIRST_POSITION_COLUMN;

    protected StateLowerLeftCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void execute() {
        if (this.context.isEquals(new Coordinate(row, column))) {
            this.state = StateCoordinate.LOWER_LEFT_CORNER;
        } else {
            this.context.setStateCoordinate(new StateLeftVertical(this.context));
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return this.state;
    }
}
