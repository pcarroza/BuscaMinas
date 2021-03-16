package main.java.models.coordinate.positionCoordinate;

public abstract class Position {

    protected PositionCoordinate state;

    protected void execute(Context context) {
        if (this.isContained(context)) {
            this.toAssignPosition();
        } else {
            this.changePosition(context);
            context.execute();
        }
    }

    public abstract boolean isContained(Context context);

    public abstract void toAssignPosition();

    public abstract void changePosition(Context context);

    public PositionCoordinate getPositionCoordinate() {
        return this.state;
    }
}
