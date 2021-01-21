package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.coordinate.sttateCoordinate.StateCoordinate;

import java.util.HashMap;

public class ContextStrategy {

    private HashMap<StateCoordinate, PositionStrategy> strategies;

    private CoordinateBuscaMinas coordinate;

    public ContextStrategy(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
        this.strategies = new HashMap<>();
        this.strategies.put(StateCoordinate.UPPER_LEFT_CORNER, new UpperLeftCornerStrategy());
        this.strategies.put(StateCoordinate.RIGHT_UPPER_CORNER, new UpperLeftCornerStrategy());
        this.strategies.put(StateCoordinate.LOWER_LEFT_CORNER, new LowerLeftCornerStrategy());
        this.strategies.put(StateCoordinate.LOWER_RIGHT_CORNER, new LowerRightCornerStrategy());
    }

    public int calculateNumberOfMine(StateCoordinate stateCoordinate) {
        return this.strategies.get(stateCoordinate).calculateNumberOfMines();
    }
}


