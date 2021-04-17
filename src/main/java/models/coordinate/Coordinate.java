package main.java.models.coordinate;

import main.java.models.coordinate.positionCoordinate.ContextCoordinate;

import java.util.List;
import java.util.Objects;

public class Coordinate implements CoordinateBuscaMinas {

    private final int row;

    private final int column;

    private final ContextCoordinate context;

    public Coordinate(int row, int column) {
        assert row >= 1;
        assert column >= 1;
        this.row = row;
        this.column = column;
        context = new ContextCoordinate(this);
    }

    @Override
    public List<Coordinate> getCoordinatesAround() {
        return context.getCoordinatesAround();
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
    public CoordinateBuscaMinas clone() {
        return new Coordinate(this.row, this.column);
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
        System.out.println(coordinate.getCoordinatesAround());
    }
}
