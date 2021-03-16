package main.java.models.coordinate.positionCoordinate;

public class NullPosition extends Position {

    @Override
    public boolean isContained(Context context) {
        return false;
    }

    @Override
    public void toAssignPosition() {
        this.state = PositionCoordinate.NULL;
    }

    @Override
    public void changePosition(Context context) {

    }
}
