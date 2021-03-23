package main.java.models.coordinate;

import main.java.models.coordinate.positionCoordinate.PositionCoordinate;

import java.util.List;

public interface CoordinateBuscaMinas {

    List<Coordinate> getCoordinatesAround();

    int getRow();

    int getColumn();

}
