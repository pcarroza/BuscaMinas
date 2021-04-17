package main.java.utils;

public class ClosedInterval {

    private final int minimum;

    private final int maximum;

    public ClosedInterval(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public boolean isIncluded(int option) {
        return option >= this.minimum && option <= this.maximum;
    }
}
