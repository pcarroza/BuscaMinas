package main.java.utils;

public enum BandVertical {

    ROW_A("A"),
    ROW_B("B"),
    ROW_C("C"),
    ROW_D("D"),
    ROW_E("E"),
    ROW_F("F"),
    ROW_G("G"),
    ROW_H("H"),
    ROW_I("I"),
    ROW_J("J");

    private final String row;

    BandVertical(String row) {
        this.row = row;
    }

    public String getBandVertical() {
        return this.row;
    }
}
