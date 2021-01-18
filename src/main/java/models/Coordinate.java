package main.java.models;

import main.java.models.coordinate.ContextCoordinate;
import java.util.Objects;

public class Coordinate implements CoordinateBuscaMinas {

    private final int row;

    private final int column;

    private static ContextCoordinate contextCoordinate;

    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
        contextCoordinate = new ContextCoordinate(this);
    }

    @Override
    public EnumStateCoordinate whatPosition() {
        return contextCoordinate.getStateCoordinate();
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
        System.out.println(new Coordinate(1, 1).whatPosition());
    }
}
