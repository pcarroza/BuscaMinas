package main.java.models.coordinate.stateCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;

public class StateUpperLeftCorner extends State {

    private final int row = ConstantFlat.FIRST_POSITION_ROW;

    private final int column = row;

    protected StateUpperLeftCorner(ContextState contextCoordinate) {
        super(contextCoordinate);
    }

    @Override
    public void execute() {
        if (this.context.isEquals(new Coordinate(row, column))) {
            this.state = StateCoordinate.UPPER_LEFT_CORNER;
        } else {
            this.context.setStateCoordinate(new StateUpperRightCorner(this.context));
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return this.state;
    }
}




