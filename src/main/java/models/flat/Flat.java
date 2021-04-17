package main.java.models.flat;

import main.java.models.coordinate.Coordinate;

public interface Flat {

    void openBox(Coordinate coordinate);

    boolean isEmptyBox(Coordinate coordinate);

    boolean isBoxOccupied(Coordinate coordinate);

    void putFlagInBox(Coordinate coordinate);

    void removeFlag(Coordinate coordinate);

    boolean isFlagInBox(Coordinate coordinate);

    boolean isFlagInFlat();

    boolean isMineInBox(Coordinate coordinate);

    Box getBox(Coordinate coordinate);

    void reset();

    boolean isOpenAnyBox();

    boolean isCompleteBoard();
}
