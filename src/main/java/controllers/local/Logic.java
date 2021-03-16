package main.java.controllers.local;

import main.java.models.Game;
import main.java.models.State;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Game game;

    private final Map<State, LocalController> controllers;

    public Logic() {
        this.controllers = new HashMap<>();
    }

    public LocalController getController() {
        return controllers.get(this.game.getState());
    }
}
