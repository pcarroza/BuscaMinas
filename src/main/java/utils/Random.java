package main.java.utils;

import java.util.List;

public class Random {

    private java.util.Random random;

    public Random() {
        new java.util.Random(System.currentTimeMillis());
    }

    public List<Integer> rangeInt(int range, int first, int last) {
        return null;
    }

    public int rand(int amountOfMines) {

        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(1 + (int)(Math.random() * 5));
        }
    }
}
