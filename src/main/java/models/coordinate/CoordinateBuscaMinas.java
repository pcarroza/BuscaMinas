package main.java.models.coordinate;

import java.util.List;

public interface CoordinateBuscaMinas {

    List<Coordinate> getListOfCoordinatesAround();

    int getRow();

    int getColumn();

}
