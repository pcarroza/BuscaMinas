package main.java.models.coordinate;

import main.java.models.coordinate.positionCoordinate.ContextCoordinate;
import main.java.models.coordinate.positionCoordinate.PositionCoordinate;
import main.java.models.coordinate.strategyCoordinate.ContextStrategy;

import java.util.List;
import java.util.Objects;

public class Coordinate implements CoordinateBuscaMinas {

    private final int row;

    private final int column;

    private final ContextCoordinate contextCoordinate;

    private final ContextStrategy contextStrategy;

    public Coordinate(int row, int column) {
        assert row >= 1;
        assert column >= 1;
        this.row = row;
        this.column = column;
        contextCoordinate = new ContextCoordinate(this);
        contextStrategy = new ContextStrategy();
    }

    @Override
    public List<Coordinate> getCoordinatesAround() {
        return contextStrategy.getCoordinatesAround(this.getPosition());
    }

    private PositionCoordinate getPosition() {
        return contextCoordinate.getPosition();
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Coordinate that = (Coordinate) o;
        return row == that.getRow() && column == that.getColumn();
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {
        return "Coordinate(" + row + ", " + column + ')';
    }

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(1, 10);
        System.out.println(coordinate.getPosition());

        Coordinate coordinate1 = new Coordinate(5, 10);
        System.out.println(coordinate1.getPosition());

        Coordinate coordinate2 = new Coordinate(10,10);
        System.out.println(coordinate2.getPosition());

        Coordinate coordinate3 = new Coordinate(2,4);
        System.out.println(coordinate3.getPosition());
    }
}
