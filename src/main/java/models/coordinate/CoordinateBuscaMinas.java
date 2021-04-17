package main.java.models.coordinate;

import java.util.List;

public interface CoordinateBuscaMinas {

    List<Coordinate> getCoordinatesAround();

    int getRow();

    int getColumn();

    CoordinateBuscaMinas clone();
}
