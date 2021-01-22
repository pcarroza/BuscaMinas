package main.java.models.flat;

import main.java.type.BandHorizontal;
import main.java.type.BandVertical;

public class ConstantFlat {

    public static final int FIRST_POSITION_ROW = 1;

    public static final int FIRST_POSITION_COLUMN = FIRST_POSITION_ROW;

    public static final int LAST_POSITION_ROW = BandVertical.values().length;

    public static final int LAST_POSITION_COLUMN = BandHorizontal.values().length;
}


