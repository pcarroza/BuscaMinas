package main.java.views.menu;

enum TitleOptions {

    OPEN_BOX("ABRIR UN CASILLA."),
    PUT_FLAG_IN_BOX("PONER BANDERA EN LA CASILLA."),
    REMOVE_FLAG("ELIMINAR BANDERA DE LA CASILLA."),
    EXIT_GAME("SALIR DEL JUEGO.");

    private final String title;

    TitleOptions(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }
}
