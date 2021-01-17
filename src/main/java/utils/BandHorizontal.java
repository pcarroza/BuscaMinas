package main.java.utils;

public enum BandHorizontal {

    COLUMN_1("1"),
    COLUMN_2("2"),
    COLUMN_3("3"),
    COLUMN_4("4"),
    COLUMN_5("5"),
    COLUMN_6("6"),
    COLUMN_7("7"),
    COLUMN_8("8"),
    COLUMN_9("9"),
    COLUMN_10("10");

    private final String column;

    BandHorizontal(String column) {
        this.column = column;
    }

    public String getBandHorizontal() {
        return column;
    }
}

