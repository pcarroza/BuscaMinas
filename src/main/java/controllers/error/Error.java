package main.java.controllers.error;

public enum Error {

    THERE_IS_A_FLAG_IN_BOX("Error. Hay una bandera en la casilla."),
    IS_OPEN_THE_BOX("Error. La casilla está abierta.");

    private final String title;

    Error(String title) {
        this.title = title;
    }

    public String title() {
        return this.title;
    }
}
