package main.java.models.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;
import main.java.models.coordinate.positionCoordinate.PositionCoordinate;

import java.util.HashMap;
import java.util.List;

public class ContextStrategy {

    private HashMap<PositionCoordinate, PositionStrategy> strategies;

    private CoordinateBuscaMinas coordinate;

    public ContextStrategy(CoordinateBuscaMinas coordinate) {
        this.coordinate = coordinate;
        this.strategies = new HashMap<>();
        /*this.strategies.put(StateCoordinate.UPPER_LEFT_CORNER, new UpperLeftCornerStrategy());
        this.strategies.put(StateCoordinate.RIGHT_UPPER_CORNER, new UpperLeftCornerStrategy());
        this.strategies.put(StateCoordinate.LOWER_LEFT_CORNER, new LowerLeftCornerStrategy());
        this.strategies.put(StateCoordinate.LOWER_RIGHT_CORNER, new LowerRightCornerStrategy());*/
    }


    public List<Coordinate> getListOfCoordinatesAround(PositionCoordinate positionCoordinate) {
        return null;
    }
}


