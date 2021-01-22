package main.java.models.coordinate.stateCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class StateUpperRightCorner extends State {

    private final int row = ConstantFlat.FIRST_POSITION_ROW;

    private final int column = ConstantFlat.LAST_POSITION_COLUMN;

    protected StateUpperRightCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void execute() {
        if (this.context.isEquals(new Coordinate(row, column))) {
            this.state = StateCoordinate.RIGHT_UPPER_CORNER;
        } else {
            this.context.setStateCoordinate(new StateLowerRightCorner(this.context));
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return this.state;
    }
}
