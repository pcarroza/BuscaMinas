package main.java.models.coordinate;

import main.java.models.coordinate.positionCoordinate.PositionCoordinate;

public interface CoordinateBuscaMinas {

    PositionCoordinate getPosition();

    int getRow();

    int getColumn();

}
