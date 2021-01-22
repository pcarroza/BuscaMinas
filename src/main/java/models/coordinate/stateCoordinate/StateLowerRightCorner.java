package main.java.models.coordinate.stateCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class StateLowerRightCorner extends State {

    private final int row = ConstantFlat.LAST_POSITION_ROW;

    private final int column = ConstantFlat.LAST_POSITION_COLUMN;

    protected StateLowerRightCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void execute() {
        if (this.context.isEquals(new Coordinate(row, column))) {
            this.state = StateCoordinate.LOWER_RIGHT_CORNER;
        } else {
            this.context.setStateCoordinate(new StateLowerLeftCorner(this.context));
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return this.state;
    }
}


