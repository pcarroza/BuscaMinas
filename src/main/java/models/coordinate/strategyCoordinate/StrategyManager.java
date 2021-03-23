package main.java.models.coordinate.strategyCoordinate;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.positionCoordinate.PositionCoordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StrategyManager {

    private final HashMap<PositionCoordinate, PositionStrategy> strategies;

    public StrategyManager() {
        this.strategies = new HashMap<>();
        this.strategies.put(PositionCoordinate.UPPER_LEFT_CORNER, new UpperLeftCornerStrategy());
        this.strategies.put(PositionCoordinate.RIGHT_UPPER_CORNER, new RightUpperCornerStrategy());
        this.strategies.put(PositionCoordinate.LOWER_RIGHT_CORNER, new LowerRightCornerStrategy());
        this.strategies.put(PositionCoordinate.LOWER_LEFT_CORNER, new LowerLeftCornerStrategy());
    }

    public List<Coordinate> getCoordinatesAround(PositionCoordinate positionCoordinate) {
        return this.strategies.get(positionCoordinate).calculateNumberOfMines();
    }

    public static void main(String[] args) {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(1,2));
        coordinates.add(new Coordinate(1,2));
        coordinates.add(new Coordinate(1,2));
        StrategyManager manager = new StrategyManager();
        System.out.println(manager.getCoordinatesAround(PositionCoordinate.LOWER_LEFT_CORNER));

    }
}
