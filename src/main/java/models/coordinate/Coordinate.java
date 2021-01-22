package main.java.models.coordinate;

import main.java.models.coordinate.stateCoordinate.ContextState;
import main.java.models.coordinate.strategyCoordinate.ContextStrategy;

import java.util.List;
import java.util.Objects;

public class Coordinate implements CoordinateBuscaMinas {

    private final int row;

    private final int column;

    private static ContextState contextCoordinate;

    private static ContextStrategy contextStrategy;

    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
        contextCoordinate = new ContextState(this);
        contextStrategy = new ContextStrategy(this);
    }

    @Override
    public List<Coordinate> getListOfCoordinatesAround() {
        return contextStrategy.getListOfCoordinatesAround(contextCoordinate.getStateCoordinate());
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
        CoordinateBuscaMinas coordinate = new Coordinate(1, 1);
        boolean isEquals = coordinate.equals(new Coordinate(1,1));
        System.out.println(isEquals);
    }
}
