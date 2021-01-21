package main.java.models.coordinate;

import main.java.models.coordinate.sttateCoordinate.StateCoordinate;

public interface CoordinateBuscaMinas {

    StateCoordinate getListOfCoordinatesAround();

    int getRow();

    int getColumn();

}
