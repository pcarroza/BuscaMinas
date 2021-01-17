package main.java.utils;

import java.util.Scanner;

public class IO {

    private static IO io;

    public static IO getInstance() {
        if (io == null) {
            io = new IO();
        }
        return io;
    }

    private final Scanner scanner;

    private IO() {
        scanner = new Scanner(System.in);
    }

    public int inputInt(String text) {
        boolean right = false;
        int number = 0;
        do {
            try {
                number = scanner.nextInt();
                right = true;
            } catch (Exception e) {
                writeln("ERROR. EL FORMATO DEBE SER INT.");
            }
        } while (!right);
        return number;
    }

    public void writeln(String text) {
        System.out.println(text);
    }

    public void writeln() {
        System.out.println("");
    }

    public void write(String text) {
        System.out.print(text);
    }

    public void write() {
        System.out.print("");
    }
}

