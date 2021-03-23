package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.positionCoordinate.PositionCoordinate;

import java.util.List;

public class ContextStrategy {

    private final StrategyManager manager;

    public ContextStrategy() {
        manager = new StrategyManager();
    }

    public List<Coordinate> getCoordinatesAround(PositionCoordinate positionCoordinate) {
        return this.manager.getCoordinatesAround(positionCoordinate);
    }
}


