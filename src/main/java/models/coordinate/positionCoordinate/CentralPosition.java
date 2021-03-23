package main.java.models.coordinate.positionCoordinate;

public class CentralPosition extends Position {

    @Override
    public boolean isCoordinateInPosition(ContextCoordinate contextCoordinate) {
        return true;
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.CENTRAL_POSITION;
    }

    @Override
    public void changePosition(ContextCoordinate contextCoordinate) {
    }
}
