package main.java.models.coordinate.stateCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.flat.ConstantFlat;

import java.util.ArrayList;
import java.util.List;

public class StateUpperHorizontal extends State {

    private final int row = ConstantFlat.FIRST_POSITION_ROW;

    private final List<CoordinateBuscaMinas> columns;

    protected StateUpperHorizontal(ContextState contextCoordinate) {
        super(contextCoordinate);
        columns = new ArrayList<>();
        for (int i = 1; i < ConstantFlat.LAST_POSITION_COLUMN - 1; i++) {
            columns.add(new Coordinate(row, i));
        }
    }

    @Override
    public void execute() {
        if (this.columns.contains(this.context.getCoordinate())) {
            this.state = StateCoordinate.HORIZONTAL_UPPER_BAND;
        } else {
            this.context.setStateCoordinate(new StateLowerHorizontal(this.context));
        }
    }

    @Override
    public StateCoordinate getStateCoordinate() {
        return this.state;
    }
}
