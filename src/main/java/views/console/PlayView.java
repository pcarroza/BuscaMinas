package main.java.views.console;

import main.java.controllers.PlayController;
import main.java.views.menu.PlayMenu;

public class PlayView {

    public void interact(PlayController playController) {
        new PlayMenu(playController).execute();
    }
}
