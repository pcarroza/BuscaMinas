package main.java.models.coordinate.positions;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.CoordinateBuscaMinas;

public class ExactPosition {

    private CoordinateZone coordinateZone;

    private CoordinateBuscaMinas exactCoordinate;

    public void setPositionCoordinate(CoordinateZone coordinateZone) {
        this.coordinateZone = coordinateZone;
    }

    public void setCoordinateBuscaMinas(Coordinate coordinate) {
        this.exactCoordinate = coordinate;
    }


    public CoordinateZone getPosition() {
        return null;
    }
}
