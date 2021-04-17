package main.java.utils;

import main.java.views.utils.ClosedIntervalView;

public class LimitIntDialog {

    private static LimitIntDialog limitIntDialog;

    public static LimitIntDialog getInstance() {
        if (limitIntDialog == null) {
            limitIntDialog = new LimitIntDialog();
        }
        return limitIntDialog;
    }

    public int read(String title, int minimum, int maximum) {
        assert title != null;
        ClosedInterval limits = new ClosedInterval(minimum, maximum);
        ClosedIntervalView limitsView = new ClosedIntervalView("El valor debe estar entre ", limits);
        int value;
        boolean right;
        do {
            value = Console.getInstance().readInt(title + " " + limitsView + ": ");
            right = limits.isIncluded(value);
            if (!right) {
                limitsView.writeln();
            }
        } while (!right);
        return value;
    }

    public int read(String title, int maximum) {
        return this.read(title, 1, maximum);
    }
}
