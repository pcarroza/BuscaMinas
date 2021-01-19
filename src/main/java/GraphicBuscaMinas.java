package main.java;

import main.java.views.View;

public class GraphicBuscaMinas extends BuscaMinas {

    @Override
    protected View createView() {
        return null;
    }

    public static void main(String[] args) {
        new GraphicBuscaMinas().run();
    }
}
