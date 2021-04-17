package main.java.views.utils;

import main.java.utils.Console;

public enum Message {

    WELCOME_TITLE("   BIENVENIDA AL JUEGO BUSCA MINAS"),
    ENTER_OPTION("Ingrese Opción: "),
    ENTER_ROW("Ingrese Fila: "),
    ENTER_COLUMN("Ingrese Columna: ");

    private final String title;

    Message(String text) {
        this.title = text;
    }

    public static void writeWelcomeTitle() {
        Console.getInstance().writeln();
        Console.getInstance().writeln("-------------------------------------");
        Message.WELCOME_TITLE.write();
        Console.getInstance().writeln();
        Console.getInstance().writeln("-------------------------------------");
    }

    public void write() {
        Console.getInstance().write(this.title);
    }

    public String geTitle() {
        return this.title;
    }
}
