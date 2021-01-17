package main.java.models;

import main.java.models.flatFactory.Flat;
import main.java.models.flatFactory.FlatFactoryMethod;

public class Board {

    private final Flat flat;

    public Board() {
        flat = FlatFactoryMethod.getInstance().getFlat();
    }

    public void openBox(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.openBox(coordinate);
    }

    public void remover(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.removeFlag(coordinate);
    }

    public void putFlag(Coordinate coordinate) {
        this.flat.putFlagInBox(coordinate);
    }

    public boolean isEmpty(Coordinate coordinate) {
        return this.flat.isEmptyBox(coordinate);
    }

    public boolean isMineBox(Coordinate coordinate) {
        return this.flat.isMineInBox(coordinate);
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        return this.flat.isFlagInBox(coordinate);
    }
}
