package main.java.models.stateCoordinate;

import main.java.models.EnumStateCoordinate;

public interface CoordinateBuscaMinas {

    EnumStateCoordinate getPosition();

    int getRow();

    int getColumn();

}
