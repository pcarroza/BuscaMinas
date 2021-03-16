package main.java.models.coordinate.positionCoordinate;

public class CentralPosition extends Position {

    @Override
    public boolean isContained(Context context) {
        return true;
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.CENTRAL_POSITION;
    }

    @Override
    public void changePosition(Context context) {
    }
}
