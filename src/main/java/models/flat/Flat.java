package main.java.models.flat;

import main.java.models.Coordinate;

public interface Flat {

    void openBox(Coordinate coordinate);

    boolean isEmptyBox(Coordinate coordinate);

    void putFlagInBox(Coordinate coordinate);

    void removeFlag(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    boolean isMineInBox(Coordinate coordinate);

    Box getBox(Coordinate coordinate);
}
