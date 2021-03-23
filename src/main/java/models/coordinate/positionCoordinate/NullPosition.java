package main.java.models.coordinate.positionCoordinate;

public class NullPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        return false;
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.NULL;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {

    }
}
