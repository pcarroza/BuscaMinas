package main.java.models.coordinate;

import main.java.models.coordinate.positionCoordinate.Context;
import main.java.models.coordinate.positionCoordinate.PositionCoordinate;

import java.util.Objects;

public class Coordinate implements CoordinateBuscaMinas {

    private final int row;

    private final int column;

    private static Context context;

    public Coordinate(int row, int column) {
        assert row >= 1 && column >= 1;
        this.row = row;
        this.column = column;
        context = new Context(this);
    }

    @Override
    public PositionCoordinate getPosition() {
        return context.getPositionCoordinate();
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
        Coordinate coordinate = new Coordinate(1, 1);
        System.out.println(coordinate.getPosition());

        Coordinate coordinate1 = new Coordinate(1, 10);
        System.out.println(coordinate1.getPosition());

        Coordinate coordinate2 = new Coordinate(10,10);
        System.out.println(coordinate2.getPosition());

        Coordinate coordinate3 = new Coordinate(2,4);
        System.out.println(coordinate3.getPosition());

    }
}
